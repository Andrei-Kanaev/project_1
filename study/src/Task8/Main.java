package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filter filter = new Filter();

        while (true){
            printMenu();
            System.out.println("Введит команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                filter.intNumbers();
            }
            else if (command == 2){
                filter.filter();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - ввести массив");
        System.out.println("2 - отфильтровать массив");
        System.out.println("0 - выход");
    }
}
