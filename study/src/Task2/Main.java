package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();
            if (command == 1){
                addInformation();
            }
            else if (command == 2){
                showInformation();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - добавить данные о студенте");
        System.out.println("2 - вывести данные о студенте ");
        System.out.println("0 - выход");
    }
    public static void addInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя студента: ");
        String name = scanner.nextLine();

        System.out.println("Введите год начала обучения: ");
        int studyDate = scanner.nextInt();

        System.out.println("Введите средний балл студента: ");
        double averageGrade = scanner.nextDouble();

        Student student = new Student(name, studyDate, averageGrade);
    }
    public static void showInformation(){
        System.out.println("Имя студента: " + Student.name);
        System.out.println("Год поступления: " + Student.studyDate);
        System.out.println("Средняя оценка: " + Student.averageGrade);
    }
}
