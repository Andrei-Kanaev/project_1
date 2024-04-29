package Project2.main.java.org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // экземпляра класса сканера
        ReportService service = new ReportService(); // создание экземпляра класса ReportService

        while (true) { // цикл while

            printMenu(); // вызов метода эля отображения меню
            System.out.println("Введите команду: ");
            int command = scanner.nextInt(); // ввод команды

            if (command == 1) {   // условие if для введенной командой
                service.readMonthStatistic(); // вызов метода
            } else if (command == 2) { // условие if для введенной командой
                service.readYearStatistic(); // вызов метода
            } else if (command == 3) { // условие if для введенной командой
                System.out.println("Введите год: ");
                int year = scanner.nextInt(); // ввод года
                service.verifyReportsByYear(year); // вызов метода
            } else if (command == 4) { // условие if для введенной командой
                System.out.println("Введите год: ");
                int year = scanner.nextInt(); // ввод года
                service.printMonthlyReport(year); // вызов метода
            } else if (command == 5) { // условие if для введенной командой
                System.out.println("Введите год: ");
                int year = scanner.nextInt(); // ввод года
                service.printYearlyReport(year); // вызов метода
            } else if (command == 0) { // условие if для введенной командой
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break; // выход из цикла
            }
        }
    }

    public static void printMenu() { // метод для отображение меню
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о месячных отчётах за год");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выход");

    }
    public static void printLine(){ // метод для разделения линией
        System.out.println("-------------------------------------------------");
    }
}
