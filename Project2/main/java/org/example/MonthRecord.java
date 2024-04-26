package Project2.main.java.org.example;

public class MonthRecord {
    String itemName;
    public Boolean isExpense;
    public Integer quantity;
    public Integer unitPrice;

    public MonthRecord(String name,
                       Boolean expense,
                       Integer quantity,
                       Integer unitPrice){

        itemName = name;
        this.isExpense = expense;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }
    public String toString() {
        return
                "Название: " + itemName + ", " +
                "Расходы: " + isExpense + ", " +
                "Количество: " + quantity + ", " +
                "Цена: " + unitPrice;
    }
}
