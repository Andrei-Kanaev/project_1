package Project2.main.rewrite_project;

public class MonthRecord {
    String itemName;
    public Boolean isExpense;
    public Integer quantity;
    public Integer unitPrice;

    public MonthRecord(String itemName,
                       Boolean isExpense,
                       Integer quantity,
                       Integer unitPrice){

        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }
    public String toString(){
        return
                        "Название: " + itemName + ", " +
                        "Траты: " + isExpense + ", " +
                        "Кол-во: " + quantity + ", " +
                        "Цена: " + unitPrice;
    }
}
