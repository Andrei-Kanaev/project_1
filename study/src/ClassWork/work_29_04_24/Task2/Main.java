package ClassWork.work_29_04_24.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectMenu();
    }

    public static void selectMenu() {
        UserOptions userOptions = new UserOptions();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            printLine();

            System.out.println("Введите команду: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {
                System.out.println("Введите имя: ");
                String password = scanner.nextLine();
                System.out.println("Введите email:");
                String email = scanner.nextLine();
                System.out.println("Введите пароль: ");
                String name = scanner.nextLine();
                userOptions.userRegistration(email, name, password);
                System.out.println("Вы зарегистрировались!");
                printLine();
            } else if (command == 2) {
                System.out.println("Введите email:");
                String email = scanner.nextLine();
                System.out.println("Введите пароль: ");
                String password = scanner.nextLine();
                userOptions.userLogIn(email, password);
                printLine();
            } else if (command == 3) {
                System.out.println("Введите email:");
                String email = scanner.nextLine();
                System.out.println("Введите пароль: ");
                String password = scanner.nextLine();
                userOptions.changePassword(email, password);
                printLine();
            } else if (command == 0) {
                printLine();
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - зарегистрироваться в системе");
        System.out.println("2 - войти в систему");
        System.out.println("3 - изменить пароль");
        System.out.println("0 - выход");
    }

    public static void printLine() {
        System.out.println("------------------------------------------");
    }
}