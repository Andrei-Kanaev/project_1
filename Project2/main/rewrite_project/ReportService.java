package Project2.main.rewrite_project;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportService {

    private Map<Integer, YearlyStatistic> yearStatistics;

    public void reportService() {
        yearStatistics = new HashMap<>();
    }
    public void readMonthStatistic() {

        List<String> fileNames = filesList(ReportType.MONTH);
        for (String fileName : fileNames) {
            List<String> monthLines = ReportReader.readFileContents(fileName);
            String fileName2 = fileName.replaceFirst("m.", "");
            String fileName3 = fileName2.replaceFirst(".csv", "");
            String fileYear = fileName3.substring(0, 4);
            String fileMonth = fileName3.substring(4, 6);

            int month = Integer.parseInt(fileMonth);
            int year = Integer.parseInt(fileYear);

           YearlyStatistic yearlyStatistic;
            if (yearStatistics.containsKey(year)) {
                yearlyStatistic = yearStatistics.get(year);
            } else {
                yearlyStatistic = new YearlyStatistic();
            }

            MonthlyReport monthlyReport = new MonthlyReport(month, year);
            List<MonthRecord> records = new ArrayList<>();
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

    public List<String> filesList(ReportType type){
        List<String> fileNames = new ArrayList<>();
        String reportFiles = "C:\\Users\\aakan\\IdeaProjects\\study\\src\\Project2\\main\\resources";
        File directory = new File(reportFiles);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if(type.equals(Project2.main.java.org.example.ReportType.YEAR)){
                    fileNames.add(file.getName());
                    System.out.println(file.getName());
                }else{
                    fileNames.add(file.getName());
                    System.out.println(file.getName());
                }

            }
        }
        return fileNames;
    }
}

