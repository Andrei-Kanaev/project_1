package Project2.main.rewrite_project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ReportReader {
    static ArrayList<String> readFileContents(String fileName) {
        String path = "src/Project2/main/resources/" + fileName;
        try {
            return new ArrayList<>(Files.readAllLines(Path.of(path)));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с отчётом");
            return new ArrayList<>();
        }
    }
}
