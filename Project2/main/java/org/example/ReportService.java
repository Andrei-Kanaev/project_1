package Project2.main.java.org.example;

import java.io.File;
import java.util.*;

public class ReportService {

    private Map<Integer, YearlyStatistic> yearStatistics;

    public ReportService() {
        yearStatistics = new HashMap<>();

    }

    public void printYearlyReport(int year) {
        System.out.println("Траты за этот год составили: " + yearStatistics.get(year).getYearlyReport().getExpenses());
        System.out.println("Доходы за этот год составили: " + yearStatistics.get(year).getYearlyReport().getIncomes());

    }

    public void printMonthlyReport(int year) {
        if(yearStatistics.containsKey(year)){
            for(MonthlyReport monthlyReport: yearStatistics.get(year).getMonthlyReports()){
                if(Objects.nonNull(monthlyReport)){
                    System.out.println("Траты за месяц " + monthlyReport.month + " составили: " + monthlyReport.getExpenses());
                    System.out.println("Доходы за месяц " + monthlyReport.month + " составили: " + monthlyReport.getIncomes());
                }
            }
        }else{
            System.out.println("Такого года нет!");
        }
    }

    public void readMonthStatistic() {
        // TODO подумать\погуглить как извлечь месяц и год

        List<String> fileNames = filesList(ReportType.MONTH);
        for(String fileName: fileNames){
            List<String> monthLines = ReportReader.readFileContents(fileName);
            String fileName2 = fileName.replaceFirst("m.", "");
            String fileName3 = fileName2.replaceFirst(".csv", "");
            String fileYear = fileName3.substring(0, 4);
            String fileMonth = fileName3.substring(4, 6);

            int month = Integer.parseInt(fileMonth);
            int year = Integer.parseInt(fileYear);

            YearlyStatistic yearlyStatistic;
            if(yearStatistics.containsKey(year)){
                yearlyStatistic = yearStatistics.get(year);
            }else {
                yearlyStatistic = new YearlyStatistic();
            }

            MonthlyReport monthlyReport = new MonthlyReport(month, year);
            List<MonthRecord> records = new ArrayList<>();
            // TODO распарсить массив
            for (int i = 1; i < monthLines.size(); i++) {
                String[] elems = monthLines.get(i).split(",");
                String itemName = elems[0];
                boolean isExpense = Boolean.parseBoolean(elems[1]);
                int quantity = Integer.parseInt(elems[2]);
                int unitPrice = Integer.parseInt(elems[3]);
                MonthRecord monthRecord = new MonthRecord(itemName, isExpense, quantity, unitPrice);
                records.add(monthRecord);
            }
            monthlyReport.setRows(records);

            yearlyStatistic.setMonthlyReport(month, monthlyReport);
            yearStatistics.put(year, yearlyStatistic);

        }
    }

    public void readYearStatistic() {

        List<String> fileNames = filesList(ReportType.YEAR);
        // TODO подумать\погуглить как извлечь год
        for(String fileName : fileNames){

            ArrayList<String> yearLines = ReportReader.readFileContents(fileName);
            String fileName2 = fileName.replaceFirst("y.", "");
            String fileYear = fileName2.replaceFirst(".csv", "");

            int year = Integer.parseInt(fileYear);

            YearlyStatistic yearlyStatistic;
            if (yearStatistics.containsKey(year)){
                yearlyStatistic = yearStatistics.get(year);
            } else {
                yearlyStatistic = new YearlyStatistic();
            }
            List<YearRecord> records = new ArrayList<>();
            for (int i = 1; i < yearLines.size(); i++) {
                String[] elems = yearLines.get(i).split(",");
                int month = Integer.parseInt(elems[0]);
                int amount = Integer.parseInt(elems[1]);
                boolean isExpense = Boolean.parseBoolean(elems[2]);
                YearRecord yearRecord = new YearRecord(month, amount, isExpense);
                records.add(yearRecord);

            }
            YearlyReport yearlyReport = new YearlyReport(year);
            yearlyReport.rows = records;

            yearlyStatistic.setYearlyReport(yearlyReport);
            yearStatistics.put(year, yearlyStatistic);
        }

    }

    public List<String> filesList(ReportType type){
        List<String> fileNames = new ArrayList<>();
        String reportFiles = "C:\\Users\\aakan\\IdeaProjects\\study\\src\\Project2\\main\\resources";
        File directory = new File(reportFiles);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                String firstLetter = file.getName().substring(0, 1);
                if(type.equals(ReportType.YEAR) && firstLetter.equals("y")){
                    fileNames.add(file.getName());
                    System.out.println(file.getName());
                }else if(type.equals(ReportType.MONTH)  && firstLetter.equals("m")){
                    fileNames.add(file.getName());
                    System.out.println(file.getName());
                }

            }
        }
        return fileNames;
    }

    public void verifyReportsByYear(int year){
        if(!yearStatistics.containsKey(year)){
            System.out.println("Отчетов  по  эту году не найдено: " + year);
            return;
        }
        YearlyStatistic statistic = yearStatistics.get(year);

        boolean checkError = false;

        for(MonthlyReport monthlyReport : statistic.getMonthlyReports()){
            if(Objects.nonNull(monthlyReport)){
                boolean verifyExpenses = monthlyReport.getExpenses() != statistic.getYearlyReport().getExpensesByMonth(monthlyReport.month);
                boolean verifyIncomes = monthlyReport.getIncomes() != statistic.getYearlyReport().getIncomesByMonth(monthlyReport.month);

                if (verifyExpenses || verifyIncomes){
                    checkError = true;
                    System.out.println("Возникла ошибка при сверке данных в конкретных месяца " + monthlyReport.month);

                    break;

                }
            }

        }
        if(!checkError){
            System.out.println("Сверка прошла без ошибок!");
        }
    }
}
