package Task8;

import java.util.ArrayList;
import java.util.Scanner;

public class Filter {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void intNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел планируете ввести? ");
        int counter = scanner.nextInt();
        for (int i = 0; i < counter; i++){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Ваш массив: " + numbers);
    }
    public void filter(){
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 != 0){
                numbers.remove(i);
            }
        }
        System.out.println("Отсортированный массив: " + numbers);
    }
}
