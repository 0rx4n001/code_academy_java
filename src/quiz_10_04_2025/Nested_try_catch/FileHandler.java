package quiz_10_04_2025.Nested_try_catch;

import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void readFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            try {
                int data = fileReader.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = fileReader.read();
                }
            } catch (IOException e) {
                System.out.println("Daxili catch bloku: Fayl oxunarkən problem yarandı - " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Xarici catch bloku: Fayl açılarkən problem yarandı - " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                    System.out.println("\nFayl bağlanıb.");
                }
            } catch (IOException e) {
                System.out.println("Fayl bağlanarkən problem yarandı - " + e.getMessage());
            }
        }
    }
}

