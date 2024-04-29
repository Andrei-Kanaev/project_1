package Ex;

import static Task1.Main.scanner;

public class ClassTwo {

    public void printCommand(){

        System.out.println("ClassTwo");
        System.out.println("введите что хотите: \n");
        String line = scanner.nextLine();
        System.out.println("печатаю что вы написали: \n" + line);
    }
}
