package Project2.main.java.org.example;

public class YearRecord {
    Integer month;
    Integer amount;
    Boolean isExpense;

    public YearRecord (Integer month,
                       Integer amount,
                       Boolean isExpense){

        this.month = month;
        this.amount =  amount;
        this.isExpense =  isExpense;
    }
    public String toString() {
        return
                "Месяц: " + month + ", " +
                        "Расходы: " + isExpense + ", " +
                        "Количество: " + amount;
    }
}
