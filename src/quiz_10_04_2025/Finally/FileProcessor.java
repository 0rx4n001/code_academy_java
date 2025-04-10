package quiz_10_04_2025.Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {
    public static void readFile(String fileName) {
        Scanner scanner = null;
        try {
            System.out.println("Try bloku işləyir");
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Catch bloku: Fayl tapılmadı");
        } finally {
            if (scanner != null) {
                System.out.println("Finally bloku: Fayl bağlanır");
                scanner.close();
            } else {
                System.out.println("Finally bloku: Fayl açılmadı, bağlanma yoxdur");
            }
        }
    }
}
