package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        printMenu();

        while (true){
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                taskManager.addTask();
            }
            else if (command == 2){
                taskManager.removeTask();
            }
            else if (command == 3){
                taskManager.showTasks();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - добавить задачу");
        System.out.println("2 - удалить задачу");
        System.out.println("3 - вывести список задач");
        System.out.println("0 - выход");
    }
}
