package HomeWork_15_04_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, List<String>> events = new TreeMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {
                System.out.println("Введите дату события: ");
                String localDate = scanner.nextLine();
                System.out.println("Введите событие: ");
                String event = scanner.nextLine();
                printLine();

                List<String> eventList = events.getOrDefault(localDate, new ArrayList<>());
                eventList.add(event);
                events.put(localDate, eventList);
            }
            else if (command == 2) {
                System.out.println("--- Просмотр истории ---");
                System.out.println("Введите дату: ");
                String date = scanner.nextLine();
                printLine();

                List<String> eventList = events.get(date);
                for (String event : eventList) {
                    System.out.println(event);
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
        System.out.println("1 - добавить событие");
        System.out.println("2 - показать календарь");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }
}




