package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        NumberOper numberOper = new NumberOper();
        printMenu();

        while (true){
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){

                System.out.println("Сколько чисел планируете ввести? ");
                int counter = scanner.nextInt();
                for (int i = 0; i < counter; i++){
                    System.out.println("Введите число: ");
                    int number = scanner.nextInt();
                    numberOper.addNumber(number);
                }
                System.out.println("Ваш массив: " + numberOper.numbers);
            }
            else if (command == 2){
                System.out.println("Введите число, которое хотите удалить из массива: ");
                int number = scanner.nextInt();
                numberOper.deleteNumber(number);

                System.out.println("Ваш массив: " + numberOper.numbers);
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - ввести массив чисел");
        System.out.println("2 - ввести число, которое нужно удалить из массива");
        System.out.println("0 - выход");
    }
}
