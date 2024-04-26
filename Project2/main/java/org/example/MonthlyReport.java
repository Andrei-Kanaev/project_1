package Project2.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    List<MonthRecord> rows = new ArrayList<>();
    int month;
    int year;

    public MonthlyReport(int month, int year){
        this.month = month;
        this.year = year;
    }

    public void setRows(List<MonthRecord> rows) {
        this.rows = rows;
    }

    public int getExpenses(){
        int  sum = 0;
        for(MonthRecord monthRecord: rows){
            if (monthRecord.isExpense){
                sum += monthRecord.quantity * monthRecord.unitPrice;
            }
        }
        return sum;
    }

    public int getIncomes(){
        int sum = 0;
        for(MonthRecord monthRecord: rows){
            if (!monthRecord.isExpense){
                sum +=monthRecord.quantity * monthRecord.unitPrice;
            }
        }
        return sum;
    }
}
