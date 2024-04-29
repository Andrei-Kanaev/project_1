package HomeWork_15_04_2024;

import java.util.HashMap;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String[]> persons = new HashMap<>();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {

                System.out.println("Придумайте и введите логин ");
                String login = scanner.nextLine();
                System.out.println("Введите ваше имя: ");
                String name = scanner.nextLine();
                System.out.println("Введите вашу фамилию: ");
                String surname = scanner.nextLine();
                System.out.println("Введите ваш пол: ");
                String gender = scanner.nextLine();
                System.out.println("Введите ваш возраст: ");
                String age = scanner.nextLine();


                System.out.println("Пользавтель успешно добален!");
                printLine();

                String[]User = {name, surname, gender, age};
                persons.put(login, User);
            }
            else if (command == 2) {
                System.out.println("--- Вывод информации о пользователе ---");
                System.out.println("Введите логин: ");
                String login = scanner.nextLine();
                String[] person = persons.get(login);
                if (persons.containsKey(login)){
                    System.out.println("Имя: " + person[0] + ". фамилия:  " + person[1] + ". пол: " + person[2] + ". возраст: " +  person[3]);
                }
                else{
                    System.out.println("Такой пользователя нет!");
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
        System.out.println("1 - зарегестрироваться");
        System.out.println("2 - посмотреть информацию о пользователе");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }

}

