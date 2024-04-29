package HomeWork.Project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        labelShow();

        while (true) {
            showInterface();

            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.setTarget();
            } else if (command == 2) {
                stepTracker.writeStepsToDay();
            } else if (command == 3) {
                stepTracker.showStatistic();
            } else if (command == 4){
                stepTracker.showMaxDay();
            } else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            } else {
                System.out.println(" !!!ОШИБКА!!!\n!!!НЕВЕРНЫЙ НОМЕР КОМАНДЫ!!!");
            }
        }

    }

    public static void showInterface() {

        System.out.println("Выберете действие:");
        System.out.println("1 - Изменить цель по количеству шагов в день");
        System.out.println("2 - Ввести количество пройденных шагов");
        System.out.println("3 - Вывод статистики");
        System.out.println("4 - Вывести максимальное количество шагов по месяцам");
        System.out.println("0 - Выход");
        printLine();
    }

    public static void labelShow() {
        System.out.println("----- ПРОГРАММА ПОДСЧЁТА КАЛОРИЙ -----");
        System.out.println("\n----Цель шагов по умолчанию = 1000----\n");
    }

    public static void printLine() {
        System.out.println("--------------------------------------");
    }
}
