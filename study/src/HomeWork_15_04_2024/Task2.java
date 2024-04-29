package HomeWork_15_04_2024;

import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String[]> goods = new TreeMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введите название товара: ");
                String name = scanner.nextLine();
                System.out.println("Введите цену: ");
                String price = scanner.nextLine();
                System.out.println("Введите кол-во: ");
                String quantity = scanner.nextLine();
                System.out.println("Введите дополнительную иснформацию о товаре: ");
                String info = scanner.nextLine();
                printLine();

                String[] Product = {price, quantity, info};
                goods.put(name, Product);
            }
            else if (command == 2) {
                System.out.println("Поиск товара");
                System.out.println("Введите название товара: ");
                String name = scanner.nextLine();
                String[] Products = goods.get(name);
                if (goods.containsKey(name)){
                    System.out.println(Products[0] + " руб. " + Products[1] + " шт. " + " доп. инф. " + Products[2]);
                }
                else{
                    System.out.println("Такого товара нет!");
                }
                printLine();

            }
            else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("1 - добавить товар");
        System.out.println("2 - найти товар");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }
}


