package Task3;

import java.util.ArrayList;

import static Task1.Main.scanner;

public class TaskManager {
   ArrayList<String> tasks = new ArrayList<>();
    public void addTask(){
        System.out.println("Какую задачу хотите добавить?");
        String task = scanner.next();
        tasks.add(task);
        System.out.println("Задача добавлена!");
    }
    public void removeTask() {
        System.out.println("Какую задачу хотите удалить?");
        int index = scanner.nextInt();
        tasks.remove(index);
        System.out.println("Задача удалена!");
    }
    public void showTasks(){
        System.out.println("Вот Ваш список задач: ");
        System.out.println(tasks);
    }
}
