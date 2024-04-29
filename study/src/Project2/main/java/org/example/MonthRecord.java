package Project2.main.java.org.example;

public class MonthRecord {
    String itemName; // объявление переменной
    public Boolean isExpense; // объявление переменной
    public Integer quantity; // объявление переменной
    public Integer unitPrice; // объявление переменной

    public MonthRecord(String name, // метод инициализации переменных
                       Boolean expense,
                       Integer quantity,
                       Integer unitPrice){

        itemName = name; // инициализация переменной
        this.isExpense = expense; // инициализация переменной
        this.quantity = quantity; // инициализация переменной
        this.unitPrice = unitPrice; // инициализация переменной

    }
    public String toString() { // метод преобразования хэшкода в слова
        return
                "Название: " + itemName + ", " +
                "Расходы: " + isExpense + ", " +
                "Количество: " + quantity + ", " +
                "Цена: " + unitPrice;
    }
}
