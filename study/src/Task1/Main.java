package Task1;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        printMenu();

        while (true) {
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1) {
                double firstNumber = doubleFirstNumber();
                double secondNumber = doubleSecondNumber();
                double result = calculator.summa(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
            }
            else if (command == 2) {
                double firstNumber = doubleFirstNumber();
                double secondNumber = doubleSecondNumber();
                double result = calculator.subtraction(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
            }
            else if (command == 3) {
                double firstNumber = doubleFirstNumber();
                double secondNumber = doubleSecondNumber();
                double result = calculator.multiplication(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
            }
            else if (command == 4) {
                double firstNumber = doubleFirstNumber();
                double secondNumber = doubleSecondNumber();
                double result = calculator.difference(firstNumber, secondNumber);
                System.out.println("Результат: " + result);
            }
            else if (command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберете команду:");
        System.out.println("1 - сложить числа");
        System.out.println("2 - вычесть числа");
        System.out.println("3 - умножить числа");
        System.out.println("4 - разделить числа");
        System.out.println("0 - Выход");
    }
    public static double doubleFirstNumber() {
        System.out.println("Введите первое число: ");
        return scanner.nextDouble();
    }

    public static double doubleSecondNumber() {
        System.out.println("Введите второе число: ");
        return scanner.nextDouble();
    }
}
