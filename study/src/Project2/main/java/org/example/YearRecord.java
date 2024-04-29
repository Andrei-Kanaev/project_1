package Project2.main.java.org.example;

public class YearRecord {
    Integer month; // обявление переменной
    Integer amount; // обявление переменной
    Boolean isExpense; // обявление переменной

    public YearRecord (Integer month, // конструктор
                       Integer amount,
                       Boolean isExpense){

        this.month = month; // инициализация переенной
        this.amount =  amount; // инициализация переенной
        this.isExpense =  isExpense; // инициализация переенной
    }
    public String toString() { // метод преобразования хешкода в текст
        return
                "Месяц: " + month + ", " +
                        "Расходы: " + isExpense + ", " +
                        "Количество: " + amount;
    }
}
