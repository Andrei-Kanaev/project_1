package Task9;

import java.util.Scanner;

public class Library {

    static Scanner scanner = new Scanner(System.in);
    Book[] books = new Book[]{
            new Book("Капитанская дочка", "А.С. Пушкин", 1834)
    };

    public static void addBook() {
        System.out.println("Введите название книги: ");
        String bookName = scanner.nextLine();
        System.out.println("Введите автора книги: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите дату: ");
        int date = scanner.nextInt();
        scanner.nextLine();


    }
}


