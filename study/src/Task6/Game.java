package Task6;

import static Task1.Main.scanner;
import java.util.Random;

public class Game {
    public void numberComparison(){
        System.out.println("Введите чилсо: ");
        int myNumber = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        if (myNumber > randomNumber){
            System.out.println("Ваши число больше загаданного числа");
        }
        else if (myNumber < randomNumber){
            System.out.println("Ваши число меньше загаданного числа");
        }
        else {
            System.out.println("Позравляем! Вы угадали число!");
        }
        scanner.close();
    }
}
