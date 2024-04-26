package Project2.main.java.org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReportService service = new ReportService();

        while (true) {

            printMenu();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();
            // TODO enum (на подумать)
            if (command == 1) {
                service.readMonthStatistic();
            } else if (command == 2) {
                service.readYearStatistic();
            } else if (command == 3) {
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                service.verifyReportsByYear(year);
            } else if (command == 4) {
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                service.printMonthlyReport(year);
            } else if (command == 5) {
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                service.printYearlyReport(year);
            } else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о месячных отчётах за год"); // доделать вывод через repotservice
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выход");

    }
    public static void printLine(){
        System.out.println("-------------------------------------------------");
    }
}
