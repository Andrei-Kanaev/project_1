package HomeWork_15_04_2024;

import java.util.HashMap;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> candidates = new HashMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введите имя кандитада: ");
                String name = scanner.nextLine();
                System.out.println("Введите кол-во голосов в %: ");
                String vote = scanner.nextLine();

                System.out.println("Данные сохранены!");
                printLine();

                candidates.put(name, vote);
            }
            else if (command == 2) {
                System.out.println("--- Вывод информации о кандидате ---");
                System.out.println("Введите имя кандидата: ");
                String name = scanner.nextLine();
                if (candidates.containsKey(name)){
                    String vote = candidates.get(name);
                    System.out.println("Кандидат " + name + " набрал " + vote + "% голосов.");
                }
                else{
                    System.out.println("Такого кандидата нет!");
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
        System.out.println("1 - добавить информацию");
        System.out.println("2 - посмотреть информацию о кандидате");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }

}
