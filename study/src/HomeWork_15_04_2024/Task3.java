package HomeWork_15_04_2024;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String[]> tickets = new LinkedHashMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введите идентификатор тикета: ");
                String id = scanner.nextLine();
                System.out.println("Введите проблему: ");
                String problem = scanner.nextLine();
                System.out.println("Введите время: ");
                String time = scanner.nextLine();

                printLine();

                String[] ticket = {id, problem, time};
                tickets.put(id, ticket);
            } else if (command == 2) {
                System.out.println("Просмотр истории");
                printLine();
                for (String id : tickets.keySet()) {
                    String[] ticket = tickets.get(id);
                    System.out.println(ticket[1] + " в " + ticket[2]);
                    printLine();

                }
            }

            else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("1 - добавить тикет");
        System.out.println("2 - показать историю");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }
}
