package HomeWork_15_04_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> Employees = new HashMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введите название отдела: ");
                String department = scanner.nextLine();
                System.out.println("Введите имя сотрудника: ");
                String name = scanner.nextLine();

                List<String> employees = Employees.getOrDefault(department, new ArrayList<>());
                employees.add(name);
                Employees.put(department, employees);
            }

            else if (command == 2) {
                System.out.println("Просмотр сотрудников: ");
                printLine();
                System.out.println("Введите название отдела: ");

                String department = scanner.nextLine();

                if (Employees.containsKey(department)) {
                    System.out.println("--- Просмотр истории ---");

                    List<String> storyList = Employees.get(department);
                    for (String stories : storyList) {
                        System.out.println(stories);
                    }
                } else {
                    System.out.println("Такого отдела нет!");
                }
            }

            else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
            printLine();
        }
    }

    public static void printMenu(){
        System.out.println("1 - добавить сотрудника");
        System.out.println("2 - показать сотрудников");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }
}


