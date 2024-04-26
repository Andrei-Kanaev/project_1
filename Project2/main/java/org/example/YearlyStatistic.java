package Project2.main.java.org.example;

public class YearlyStatistic {

    private YearlyReport yearlyReport;
    private final MonthlyReport[] monthlyReports;

    public YearlyStatistic() {
        monthlyReports = new MonthlyReport[12];
    }

    public YearlyReport getYearlyReport() {
        return yearlyReport;
    }

    public void setYearlyReport(YearlyReport yearlyReport) {
        this.yearlyReport = yearlyReport;
    }

    public MonthlyReport[] getMonthlyReports() {
        return monthlyReports;
    }

    public void setMonthlyReport(int month, MonthlyReport monthlyReport) {
        this.monthlyReports[month - 1] = monthlyReport;
    }
}
