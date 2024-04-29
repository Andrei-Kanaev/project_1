package HomeWork_11_03_2024.tasks.Task12;

public class Main {

    public static void main(String[] args) {
        int time = 9;
        String[] animals = {"Шиншилла", "Крокодил", "Лев", "Медведь", "Слон" };
        System.out.println("Сегодня в зоопарке можно увидеть кормления следующих животных: \n" + " " + animals[0] + ",\n " + animals[1] + ",\n " + animals[2] + ",\n " + animals[3] + ",\n " + animals[4]);
        System.out.println("Расписание кормлений: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println((time + i) + ":00 - " + animals[i]);
        }
    }
}
