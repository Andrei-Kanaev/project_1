package HomeWork_15_04_2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> books = new HashMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введите уникальный идентификатор книги: ");
                String id = scanner.nextLine();
                System.out.println("Введите название книги: ");
                String bookName = scanner.nextLine();
                System.out.println("Введите автора книги: ");
                String author = scanner.nextLine();
                System.out.println("Введите кол-во копий: ");
                String quantity = scanner.nextLine();
                System.out.println("Книга успешно добалена!");
                printLine();

                String[] Book = {bookName, author, quantity};
                books.put(id, Book);
            }
            else if (command == 2) {
                System.out.println("Поиск книги");
                System.out.println("Введите уникальный идентификатор книги: ");
                String id = scanner.nextLine();
                String[] book = books.get(id);
                if (books.containsKey(id)){
                    System.out.println(book[0] + ", " + book[1] + ", кол-во копий: " + book[2]);
                }
                else{
                    System.out.println("Такой книги нет!");
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
        System.out.println("1 - добавить книгу");
        System.out.println("2 - найти книгу");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }

}
