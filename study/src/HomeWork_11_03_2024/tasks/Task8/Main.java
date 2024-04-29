package HomeWork_11_03_2024.tasks.Task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        String season;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber <= 12) {
                season = getSeasonByNumber(monthNumber);
                break;
            }
            else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }

        if (season.equals("Лето")) {
            System.out.println("Летом лучше остаться в Москве.");
            return;
        }

        System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
        int ticketMoscowParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
        int ticketMoscowLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();

        if (ticketMoscowLondonParis <= ticketMoscowParis || britainVisa == 1) {
            System.out.println("Летим через Лондон!");
        } else {
            System.out.println("Летим напрямую в Париж!");

        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        if (monthNumber >= 3 && monthNumber <= 5) {
            return "Весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}

