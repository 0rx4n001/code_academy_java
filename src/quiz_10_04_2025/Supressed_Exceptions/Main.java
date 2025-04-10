package quiz_10_04_2025.Supressed_Exceptions;

import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\Hp-Account\\Desktop\\mytxt.txt")) {
            FileHandler fileHandler = new FileHandler();
            fileHandler.readFileContents(fileReader);
        } catch (IOException e) {
            System.out.println("Fayl oxuma zamanı problem yarandı: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed);
            }
        }
    }
}
