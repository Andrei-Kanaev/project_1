package ClassWork.work_29_04_24.Task4;

public class Book {
    String bookName;
    String author;
    String date;

    public Book(String bookName,  String author,  String date){
        this.bookName = bookName;
        this.author = author;
        this.date = date;
    }

    public String toString(){
        return
                "Название: " + bookName + ", " +
                        "Автор: " + author + ", " +
                        "Дата выхода: " + date + " ";

    }
}
