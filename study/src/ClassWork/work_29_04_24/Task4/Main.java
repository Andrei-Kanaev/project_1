package ClassWork.work_29_04_24.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            printLine();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                scanner.nextLine();
                System.out.println("Ввелите название: ");
                String name = scanner.nextLine();
                System.out.println("Ввелите автора: ");
                String author = scanner.nextLine();
                System.out.println("Ввелите дату выхода: ");
                String date = scanner.nextLine();
                library.addBook(name, author, date);
                printLine();
            }
            else if (command == 2){
                scanner.nextLine();
                System.out.println("Ввелите название: ");
                String name = scanner.nextLine();
                library.removeBook(name);
                printLine();
            }
            else if (command == 3){
                library.showBooks();
                printLine();
            }
            else if (command == 0){
                printLine();
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("1 - добавить книгу");
        System.out.println("2 - удалить книгу");
        System.out.println("3 - Посмотреть доступные книги");
        System.out.println("0 - выход");
    }

    public static void printLine(){
        System.out.println("---------------------------------------");
    }
}
