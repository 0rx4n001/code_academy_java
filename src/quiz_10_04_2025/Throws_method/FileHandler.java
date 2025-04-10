package quiz_10_04_2025.Throws_method;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
        fileReader.close();
    }
}
