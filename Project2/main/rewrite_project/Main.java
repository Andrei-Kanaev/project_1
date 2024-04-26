package Project2.main.rewrite_project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите кодманду: ");
            int command = scanner.nextInt();

            if(command == 1){

            }
            else if(command == 2){

            }
            else if(command == 3){

            }
            else if(command == 4){

            }
            else if(command == 5){

            }
            else if(command == 0){
                System.out.println("--- Программа завершила свою работу ---");
                break;
            }
        }
    }

    public static void printLine(){
        System.out.println("--------------------------------------");
    }

    public static void printMenu() {
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выход");

    }
}
