package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtils arrayUtils = new ArrayUtils();

        while(true){
            printMenu();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                arrayUtils.intArray();
            }
            else if (command == 2){
                arrayUtils.findMinElement();
            }
            else if (command == 3){
                arrayUtils.BubbleSortArray();
            }
            else if (command == 4){
                arrayUtils.reverseArray();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }

    }
    public static void printMenu(){
        System.out.println("1 - ввести массив");
        System.out.println("2 - найти минимальный элемент");
        System.out.println("3 - сортировка массива");
        System.out.println("4 - обращение массива");
        System.out.println("0 - выход");
    }
}
