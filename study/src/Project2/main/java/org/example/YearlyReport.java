package Project2.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class YearlyReport {

    List<YearRecord> rows = new ArrayList<>(); // создание списка

    int year; // обявление переменной

    public YearlyReport(int year){
        this.year = year;
    } // инициализация года

    public int getExpensesByMonth(int month){ // метод подсчёта трат за месяц
        int sum = 0; // обнуление сыммы
        for(YearRecord yearRecord : rows){ // проходимся по строккам
            if(yearRecord.isExpense && month == yearRecord.month){ // проверка наличия трат и соответствие месяца
                sum += yearRecord.amount; // подситываем сумму трат
            }
        }
        return sum; // возвращаем сумму трат
    }

    public int getIncomesByMonth(int month){ // метод подсчёта доходов за месяц
        int sum = 0; // обнуление сыммы
        for(YearRecord yearRecord : rows){ // проходимся по строккам
            if(!yearRecord.isExpense && month == yearRecord.month){ // обратная проверка наличия трат и соответствие месяца
                sum += yearRecord.amount; // подситываем сумму доходов
            }
        }
        return sum;  // возвращаем сумму доходов
    }

    public int getExpenses(){ // метод подсчёта доходов за год
        int sum = 0; // обнуление сыммы
        for(YearRecord yearRecord : rows){ // проходимся по строккам
            if(yearRecord.isExpense){ // проверка наличия трат
                sum += yearRecord.amount; // подситываем сумму трат
            }
        }
        return sum; // возвращаем сумму трат
    }

    public int getIncomes(){ // метод подсчёта доходов за год
        int sum = 0; // обнуление сыммы
        for(YearRecord yearRecord : rows){ // проходимся по строккам
            if(!yearRecord.isExpense){ // проверка наличия трат
                sum += yearRecord.amount; // подситываем сумму доходов
            }
        }
        return sum; // возвращаем сумму трат
    }
}
