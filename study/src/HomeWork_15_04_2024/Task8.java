package HomeWork_15_04_2024;

import java.util.Scanner;
import java.util.TreeMap;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String[]> matches = new TreeMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Введи время матча: ");
                String time = scanner.nextLine();
                System.out.println("Введите название 1-й команды: ");
                String firstTeam = scanner.nextLine();
                System.out.println("Введите название 1-й команды: ");
                String secondTeam = scanner.nextLine();
                System.out.println("Введите название победившей команды: ");
                String winner = scanner.nextLine();
                System.out.println("Введите счёт: ");
                String score = scanner.nextLine();


                System.out.println("Данные о матче успешно добавлены!");
                printLine();

                String[] Match = {firstTeam, secondTeam, winner, score};
                matches.put(time, Match);
            }
            else if (command == 2) {
                System.out.println("--- Вывод информации о матче ---");
                System.out.println("Введите время матча: ");
                String time = scanner.nextLine();
                String[] match = matches.get(time);
                if (matches.containsKey(time)){
                    System.out.println("В это время играли команды: " + match[0] + " и " + match[1] + ". Победила команда " + match[2] + " со счётом " +  match[3]);
                }
                else{
                    System.out.println("Данные отсутствуют :(");
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
        System.out.println("1 - добавить информацию о матче");
        System.out.println("2 - посмотреть информацию о матчах");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }

}


