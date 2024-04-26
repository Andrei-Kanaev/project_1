package Project2.main.rewrite_project;

public class YearRecord {
    Integer month;
    Integer amount;
    Integer isExpense;

    public YearRecord(Integer month,
                      Integer amount,
                      Integer isExpense){
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }
    public String toString() {
        return
                        "Месяц: " + month + ", " +
                        "Расходы: " + isExpense + ", " +
                        "Кол-во: " + amount;
    }
}
