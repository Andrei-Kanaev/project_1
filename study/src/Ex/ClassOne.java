package Ex;

import static Task1.Main.scanner;
public class ClassOne {
    public void printCommand(){

        System.out.println("ClassOne");
        System.out.println("введите что хотите: \n");
        String line = scanner.nextLine();
        System.out.println("печатаю что вы написали: \n" + line);
        scanner.close();
    }
}
