package HomeWork_11_03_2024.tasks.Task5;

/*

По мнению Джеффа Безоса, основателя и главы компании Amazon, идеальная встреча — это встреча, для проведения которой
хватит двух пицц. Помогите Джеффу вычислить, сколько человек можно позвать на встречу, исходя из количества кусочков
пиццы на каждого. Также определите, останется ли ещё пицца после того, как все разойдутся.
Вам нужно дополнить реализацию метода printMaximumPeopleToMeeting(), который в качестве аргументов принимает, на сколько
 кусков порезана одна пицца и сколько кусков пиццы съедает один участник встречи.


* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько кусков порезана пицца?");
        int slicesInPizza = scanner.nextInt();
        System.out.println("Сколько кусков съедает один участник встречи?");
        int slicesToPerson = scanner.nextInt();
        printMaximumPeopleToMeeting(slicesToPerson, slicesInPizza);
    }

    private static void printMaximumPeopleToMeeting(int slicesToPerson, int slicesInPizza) {
        int numOfPizzas = 2;
        int totalSlices = slicesInPizza * numOfPizzas;
        int maximumPeopleToMeeting = totalSlices / slicesToPerson;
        int leftSlices = totalSlices % slicesToPerson;
        System.out.println("Максимальное число участников идеальной встречи: " + maximumPeopleToMeeting);
        System.out.println("Останется кусков пиццы: " + leftSlices);
    }
}
