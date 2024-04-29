package Project2.main.java.org.example;

import java.io.File;
import java.util.*;

public class ReportService {

    private Map<Integer, YearlyStatistic> yearStatistics; /* объявление мапы yearStatistics с ключом типа Integer
     и объектом YearlyStatistic*/

    public ReportService() {
        yearStatistics = new HashMap<>(); // инициализация yearStatistics

    }

    public void printYearlyReport(int year) { // метод вывода трат и доходов за год
        System.out.println("Траты за этот год составили: " + yearStatistics.get(year).getYearlyReport().getExpenses());
        System.out.println("Доходы за этот год составили: " + yearStatistics.get(year).getYearlyReport().getIncomes());

    }

    public void printMonthlyReport(int year) {  // метод вывода трат и доходов за месяц
        if(yearStatistics.containsKey(year)){ // проверка наличия ключа
            for(MonthlyReport monthlyReport: yearStatistics.get(year).getMonthlyReports()){ // проходимся по массиву месяцев
                if(Objects.nonNull(monthlyReport)){ // проверка NULL
                    System.out.println("Траты за месяц " + monthlyReport.month + " составили: " + monthlyReport.getExpenses());
                    System.out.println("Доходы за месяц " + monthlyReport.month + " составили: " + monthlyReport.getIncomes());
                }
            }
        }else{
            System.out.println("Такого года нет!");
        }
    }

    public void readMonthStatistic() { // метод считывания месячной статистики из файла

        List<String> fileNames = filesList(ReportType.MONTH); // создаём список
        for(String fileName: fileNames){ // проходимся по файлам
            List<String> monthLines = ReportReader.readFileContents(fileName);  // создаём список
            String fileName2 = fileName.replaceFirst("m.", "");  // с 40 по 43 строку извлекаем число месяца из названия
            String fileName3 = fileName2.replaceFirst(".csv", "");
            String fileYear = fileName3.substring(0, 4);
            String fileMonth = fileName3.substring(4, 6);

            int month = Integer.parseInt(fileMonth);
            int year = Integer.parseInt(fileYear);

            YearlyStatistic yearlyStatistic;
            if(yearStatistics.containsKey(year)){ // проверка ключа
                yearlyStatistic = yearStatistics.get(year); // получаем данные по ключу
            }else {
                yearlyStatistic = new YearlyStatistic(); // если проверка прошла неудачно, создаём экземпляр класса
            }

            MonthlyReport monthlyReport = new MonthlyReport(month, year);  // создаём экземпляр класса
            List<MonthRecord> records = new ArrayList<>(); //  создаём список

            for (int i = 1; i < monthLines.size(); i++) {  // с 58 по 65 строку идёт разделение данных файла по запятой
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
            yearStatistics.put(year, yearlyStatistic); // передаём данные в yearlyStatistic

        }
    }

    public void readYearStatistic() { // метод считывания годовой статистики из файла

        List<String> fileNames = filesList(ReportType.YEAR); // создаём список

        for(String fileName : fileNames){ // проходимся по файлам

            ArrayList<String> yearLines = ReportReader.readFileContents(fileName); // создаём список
            String fileName2 = fileName.replaceFirst("y.", ""); // с 82 по 83 строку извлекаем число года из названия
            String fileYear = fileName2.replaceFirst(".csv", "");

            int year = Integer.parseInt(fileYear);

            YearlyStatistic yearlyStatistic;
            if (yearStatistics.containsKey(year)){ // проверка ключа
                yearlyStatistic = yearStatistics.get(year);  // получаем данные по ключу
            } else {
                yearlyStatistic = new YearlyStatistic(); // если проверка прошла неудачно, создаём экземпляр класса
            }
            List<YearRecord> records = new ArrayList<>();  //  создаём список

            for (int i = 1; i < yearLines.size(); i++) {  // с 95 по 101 строку идёт разделение данных файла по запятой
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
            yearStatistics.put(year, yearlyStatistic); // передаём данные в yearlyStatistic
        }

    }


    public List<String> filesList(ReportType type){

        List<String> fileNames = new ArrayList<>(); // создаём список
        String reportFiles = "C:\\Users\\aakan\\IdeaProjects\\study\\src\\Project2\\main\\resources"; // указываем путь к файлу
        File directory = new File(reportFiles);
        File[] files = directory.listFiles();
        if (files != null) { // проверка на null
            for (File file : files) { // проходимся по файлам
                String firstLetter = file.getName().substring(0, 1); // получаем первую букву
                if(type.equals(ReportType.YEAR) && firstLetter.equals("y")){ // проверяем, чтобы год начинался с "у"
                    fileNames.add(file.getName()); // если проверка прошла успешно - добавляем знсчение в fileNames
                    System.out.println(file.getName());
                }else if(type.equals(ReportType.MONTH)  && firstLetter.equals("m")){  // проверяем, чтобы месяц начинался с "m"
                    fileNames.add(file.getName()); // если проверка прошла успешно - добавляем знсчение в fileNames
                    System.out.println(file.getName());
                }

            }
        }
        return fileNames; // возвращаем имя файла
    }

    public void verifyReportsByYear(int year){ // метод сравнения отчёта
        if(!yearStatistics.containsKey(year)){ // если ключ не найден, то выводим строку 138
            System.out.println("Отчетов  по  эту году не найдено: " + year);
            return;
        }
        YearlyStatistic statistic = yearStatistics.get(year); // получам год по ключу

        boolean checkError = false; // обнуляем ссётчик ошибок

        for(MonthlyReport monthlyReport : statistic.getMonthlyReports()){  // проходимся по месячным отчётам
            if(Objects.nonNull(monthlyReport)){ // проверка на null
                boolean verifyExpenses = monthlyReport.getExpenses() != statistic.getYearlyReport().getExpensesByMonth(monthlyReport.month);
                // проверка соответствия трат
                boolean verifyIncomes = monthlyReport.getIncomes() != statistic.getYearlyReport().getIncomesByMonth(monthlyReport.month);
                // проверка соответствия доходов
                if (verifyExpenses || verifyIncomes){ // если проверки не сошлись
                    checkError = true; // счётчику присваиваем значние true
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
