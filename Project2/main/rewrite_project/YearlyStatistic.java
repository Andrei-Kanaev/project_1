package Project2.main.rewrite_project;

public class YearlyStatistic {

    private YearlyReport yearlyReport;
    private final MonthlyReport[] monthlyReports;

    public YearlyStatistic(){
        monthlyReports = new MonthlyReport[12];
    }
    public YearlyReport getYearlyReport(){   // Зачем это нужно?
        return yearlyReport;
    }

    public void setYearlyReport(YearlyReport yearlyReport) {   // Зачем это нужно?
        this.yearlyReport = yearlyReport;
    }

    public MonthlyReport[] getMonthlyReports() {  // Зачем это нужно?
        return monthlyReports;
    }

    public void setMonthlyReport(int month, MonthlyReport monthlyReport) // Зачем это нужно?
    {
        this.monthlyReports[month - 1] = monthlyReport;
    }
}