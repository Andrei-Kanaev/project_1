package Project2.main.java.org.example;

public class YearlyStatistic {

    private YearlyReport yearlyReport; // обявление переменной, которая хранит годовой отчёт
    private final MonthlyReport[] monthlyReports; // обявление переменной, которая хранит ежемесячные отчёты

    public YearlyStatistic() { // конструктор
        monthlyReports = new MonthlyReport[12]; // инициализая массива
    }

    public YearlyReport getYearlyReport() {  // метод получения годового отчета
        return yearlyReport;
    }

    public void setYearlyReport(YearlyReport yearlyReport) { // метод установки годового отчета
        this.yearlyReport = yearlyReport;
    }

    public MonthlyReport[] getMonthlyReports() {  //метод получения массива monthlyReports
        return monthlyReports;
    }

    public void setMonthlyReport(int month, MonthlyReport monthlyReport) { // ставим ежемесячный отчет в массив с месяцами
        this.monthlyReports[month - 1] = monthlyReport;
    }
}
