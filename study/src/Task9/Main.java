package Task9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                Library.addBook();
            }
            else if (command == 2){

            }
            else if (command == 3){

            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("1 - добавить книгу");
        System.out.println("2 - удалить книгу");
        System.out.println("3 - найти книгу");
        System.out.println("0 - выход");
    }
}
