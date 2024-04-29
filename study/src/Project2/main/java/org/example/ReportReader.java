package Project2.main.java.org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ReportReader {

    public static ArrayList<String> readFileContents(String fileName) { // метод считывания данных из файла
        String path = "src/Project2/main/resources/" + fileName; // обозначение пути к файлу
        try{ // блок try для отлова ошибки
            return new ArrayList<>(Files.readAllLines(Path.of(path))); // название предполагаемой ошибки
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с отчётом. Возможно, файл отсутствует в нужной директории.");
            return new ArrayList<>(); // возврат пустого списка
        }
    }
}
