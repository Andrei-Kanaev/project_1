package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindMaxNumber findMaxNumber = new FindMaxNumber();

        printMenu();

        while (true){
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                findMaxNumber.addNumbers();
            }
            else if (command == 2){
                findMaxNumber.showMaxNumber();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - ввести массив целых чисел");
        System.out.println("2 - вывести максимальный элемент массива");
        System.out.println("0 - выход");
    }
}
