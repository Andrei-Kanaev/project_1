package Project2.main.java.org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class YearlyReport {

    List<YearRecord> rows = new ArrayList<>();

    int year;

    public YearlyReport(int year){
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearlyReport that = (YearlyReport) o;
        return year == that.year && Objects.equals(rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, year);
    }

    public int getExpensesByMonth(int month){
        int sum = 0;
        for(YearRecord yearRecord : rows){
            if(yearRecord.isExpense && month == yearRecord.month){
                sum += yearRecord.amount;
            }
        }
        return sum;
    }

    public int getIncomesByMonth(int month){
        int sum = 0;
        for(YearRecord yearRecord : rows){
            if(!yearRecord.isExpense && month == yearRecord.month){
                sum += yearRecord.amount;
            }
        }
        return sum;
    }

    public int getExpenses(){
        int sum = 0;
        for(YearRecord yearRecord : rows){
            if(yearRecord.isExpense){
                sum += yearRecord.amount;
            }
        }
        return sum;
    }

    public int getIncomes(){
        int sum = 0;
        for(YearRecord yearRecord : rows){
            if(!yearRecord.isExpense){
                sum += yearRecord.amount;
            }
        }
        return sum;
    }
}
