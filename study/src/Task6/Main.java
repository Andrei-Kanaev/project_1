package Task6;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        while (true){
            printMenu();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1){
                game.numberComparison();
            }
            else if (command == 0){
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }
    public void printMenu(){
        System.out.println("1 - ввести число");
        System.out.println("0 - выход");
    }
}
