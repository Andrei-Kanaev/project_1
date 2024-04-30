package ClassWork.work_29_04_24.Task;

public class Product {

    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return
                "Название: " + name + ", " +
                        "Кол-во: " + quantity + " " +
                        "Цена: " + price;
    }
}

