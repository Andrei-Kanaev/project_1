package ClassWork.work_29_04_24.Task4;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book){

        for (Book name: books){
            if(name.bookName.equals(book.bookName)){
                System.out.println("Такая книга уже есть!");
                return;
            }
        }
        books.add(book);
        System.out.println("Книга добавлена");
    }

    public void removeBook(String name){
        for(Book book: books){
            if(book.bookName.equals(name)) {
                books.remove(book);
                System.out.println("Книга удалена");
                return;
            }
        }
        System.out.println("Такой книги нет!");
    }

    public void showBooks(){
        System.out.println("----- Просмотр книг -----");
        for(Book book: books) {
            System.out.println(book);
        }
    }

    public void findBookByAuthor(String author){
        for(Book book: books){
            if(author.equals(book.author)){
                System.out.println(book);
            }
        }
    }
}
