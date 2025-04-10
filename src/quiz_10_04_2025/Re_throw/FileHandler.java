package quiz_10_04_2025.Re_throw;

import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public FileReader openFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        return fileReader;
    }
    public void readFileContents(FileReader fileReader) throws IOException {
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
    }
    public void closeFile(FileReader fileReader) throws IOException {
        if (fileReader != null) {
            fileReader.close();
            System.out.println("\nFayl bağlanıb.");
        }
    }
    public void handleFileOperation(String fileName) throws IOException {
        try {
            FileReader fileReader = openFile(fileName);
            readFileContents(fileReader);
            closeFile(fileReader);
        } catch (IOException e) {
            System.out.println("Fayl əməliyyatı zamanı problem baş verdi: " + e.getMessage());
            throw e;
        }
    }
}
