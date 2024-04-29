package HomeWork_11_03_2024.tasks.Task7;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько самокатов доступно для аренды?");
        int availableScooters = scanner.nextInt();

        System.out.println("Сколько самокатов арендовано?");
        int scootersInUse = scanner.nextInt();

        Scooter scooter = new Scooter(availableScooters, scootersInUse);

        System.out.println("Что вы хотите сделать?");
        System.out.println("1 -- Узнать текущую стоимость проката");
        System.out.println("2 -- Выдать самокат");
        System.out.println("3 -- Принять самокат");
        System.out.println("4 -- Завершить работу");

        while (true) {
            System.out.println("Введите команду:");
            int command = scanner.nextInt();

            if (command == 1) {
                scooter.getPrice();
            } else if (command == 2) {
                scooter.rentScooter();
            } else if (command == 3) {
                scooter.returnScooter();
            } else if (command == 4) {
                System.out.println("Сеанс работы завершён!");
                break;
            } else {
                System.out.println("Введён неверный код команды.");
            }
        }
    }
}