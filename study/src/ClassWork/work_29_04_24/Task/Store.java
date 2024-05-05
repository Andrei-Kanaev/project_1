package ClassWork.work_29_04_24.Task;

import java.util.HashMap;
import java.util.Map;


public class Store {

    HashMap<String, Product> productList;

     public Store(){
         this.productList = new HashMap<>();
     }

     public void addProduct(String name, int quantity, double price){
         if(productList.containsKey(name)){
             System.out.println("Такой товар уже есть!");
         }
         else{
             Product product = new Product(name, quantity, price);
             productList.put(name, product);
         }
     }

     public void removeProduct(String name){
         if(productList.containsKey(name)){
             productList.remove(name);
         } else{
             System.out.println("Такого товара нет!");
         }
     }

     public void printAllProducts(){
         for (Map.Entry<String, Product> entry : productList.entrySet()) {
             Product product = entry.getValue();
             System.out.println(product);

         }
     }
}
