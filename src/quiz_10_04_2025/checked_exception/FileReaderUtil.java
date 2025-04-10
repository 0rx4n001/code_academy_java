package quiz_10_04_2025.checked_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderUtil {
    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            System.out.println("Fayl məzmunu:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
