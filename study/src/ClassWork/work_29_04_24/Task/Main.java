package ClassWork.work_29_04_24.Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        selectMenu();
    }

    public static void selectMenu(){

        Store store = new Store();

        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            printLine();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if(command == 1){
                System.out.println("Введите название продукта, который хотите добавить: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Введите количество: ");
                int quantity = scanner.nextInt();
                System.out.println("Введите цену: ");
                double price = scanner.nextDouble();
                store.addProduct(name, quantity, price);
                printLine();

            }
            else if(command == 2){
                System.out.println("Введите название продукта, который хотите удалить: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                store.removeProduct(name);
                printLine();
            }
            else if(command == 3){
                printLine();
                store.printAllProducts();
                printLine();
            }
            else if(command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                printLine();
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("1 - добавить товар");
        System.out.println("2 - удалить товар");
        System.out.println("3 - показать все товары");
        System.out.println("0 - выход");
    }

    public static void printLine(){
        System.out.println("---------------------------------------");
    }
}
