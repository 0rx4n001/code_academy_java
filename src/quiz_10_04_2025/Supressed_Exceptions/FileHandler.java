package quiz_10_04_2025.Supressed_Exceptions;

import java.io.FileReader;
import java.io.IOException;
public class FileHandler {
    public void readFileContents(FileReader fileReader) throws IOException {
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
    }
}
