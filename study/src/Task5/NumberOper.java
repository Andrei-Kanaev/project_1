package Task5;


import java.util.ArrayList;
import java.util.Scanner;


public class NumberOper {

    ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void deleteNumber(int number) {
        int index = numbers.indexOf(number);
        if (index != -1) {
            numbers.remove(index);
        }
        System.out.println("Массив без сичла " + numbers);
    }
}
