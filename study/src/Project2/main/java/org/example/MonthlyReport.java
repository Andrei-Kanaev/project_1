package Project2.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    List<MonthRecord> rows = new ArrayList<>(); // создание списка
    int month; // объявление переменной
    int year; // объявление переменной

    public MonthlyReport(int month, int year){ // метод, принимающий параметры месяца и года
        this.month = month; // инициализация переменной
        this.year = year;  // инициализация переменной
    }

    public void setRows(List<MonthRecord> rows) { // метод, принимающий параметры списка
        this.rows = rows; // инициализация переменной
    }

    public int getExpenses(){ // метод получения расходов
        int  sum = 0; // обнуление суммы
        for(MonthRecord monthRecord: rows){  // прохождение по строкам в rows
            if (monthRecord.isExpense){ // проверка наличия isExpense
                sum += monthRecord.quantity * monthRecord.unitPrice; // подсчёт расходов
            }
        }
        return sum; // возвращение значения суммы
    }

    public int getIncomes(){ // медот получения доходов
        int sum = 0; // обнуление суммы
        for(MonthRecord monthRecord: rows){ // прохождение по строкам в rows
            if (!monthRecord.isExpense){  // проверка наличия isExpense
                sum +=monthRecord.quantity * monthRecord.unitPrice; // подсчёт доходов
            }
        }
        return sum; // возвращение значения суммы
    }
}
