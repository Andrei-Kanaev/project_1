package Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUtils {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();


    public void intArray(){
        System.out.println("Сколько чисел планируете ввести? ");
        int counter = scanner.nextInt();
        for (int i = 0; i < counter; i++){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("Ваш массив: " + numbers);
    }
    public void findMinElement(){
        int minNumber = 0;
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println("Мнимальный элемент массива равен: " + minNumber);
    }
    public void BubbleSortArray(){
        int x = numbers.size();
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        System.out.println("Отсортированный массив: " + numbers);
    }
    public void reverseArray(){
        ArrayList<Integer> reverseNumbers = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--){
            reverseNumbers.add(numbers.get(i));
        }
        System.out.println("Обращённый массив: " + reverseNumbers);
    }
}
