package ClassWork.work_29_04_24.Task4;

import java.util.HashMap;
import java.util.Map;

public class Library {

    HashMap<String, Book[]> books = new HashMap<>();

    public void addBook(String name, String author, String date){
        if(books.containsKey(name)){
            System.out.println("Такая книга уже есть!");
        }
        else {
            Book[] book = {new Book(name, author, date)};
            books.put(name, book);
            System.out.println("Книга добавлена");
        }
    }

    public void removeBook(String name){
        if(!books.containsKey(name)){
            System.out.println("Такой книги нет!");
        }
        else {
            books.remove(name);
            System.out.println("Книга удалена");
        }
    }

    public void showBooks(){
        for (Map.Entry<String, Book[]> entry : books.entrySet()) {
            System.out.println("----- Просмотр книг -----");
            Book[] book = entry.getValue();
            for (Book book1 : book) {
                System.out.println(book1);
            }
        }
    }
}
