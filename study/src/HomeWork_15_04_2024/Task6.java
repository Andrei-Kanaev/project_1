package HomeWork_15_04_2024;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> story = new LinkedHashMap<>();

        while (true){
            commands();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            if(command == 1){
                System.out.println("Введите идентификатор пользователя");
                String id = scanner.nextLine();
                System.out.println("Введите запрос: ");
                String request = scanner.nextLine();

                List<String> requests = story.getOrDefault(id, new ArrayList<>());
                requests.add(request);
                story.put(id, requests);
                printLine();
            }

            else if(command == 2){
                System.out.println("Введите идентификатор пользователя: ");
                String id = scanner.nextLine();
                if (story.containsKey(id)){
                    System.out.println("--- Просмотр истории ---");

                    List<String> storyList = story.get(id);
                    for(String stories: storyList) {
                        System.out.println(stories);
                    }
                }

                else{
                        System.out.println("Неверный идентификатор пользователя");
                    }
                printLine();
            }
            else if(command == 0) {
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public static void commands(){
        System.out.println("1 - ввести поисковый запрос");
        System.out.println("2 - показать история поиска");
        System.out.println("0 - выход");
    }
    public static void printLine(){
        System.out.println("----------------------------------------");
    }
}
