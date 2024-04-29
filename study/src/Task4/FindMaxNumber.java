package Task4;

import java.util.ArrayList;

import static Task1.Main.scanner;

public class FindMaxNumber {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumbers(){
        System.out.println("Сколько чисел планируете ввести? ");
        int counter = scanner.nextInt();
        for (int i = 0; i < counter; i++){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Ваш массив: " + numbers);
    }
    public void showMaxNumber(){
        int maxNumber = 0;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Максимальный элемент массива равен: " + maxNumber);
    }
}
