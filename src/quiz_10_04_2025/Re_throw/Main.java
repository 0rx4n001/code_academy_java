package quiz_10_04_2025.Re_throw;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler();
            fileHandler.handleFileOperation("C:\\Users\\Hp-Account\\Desktop\\mytxt.txt");
        } catch (IOException e) {
            System.out.println("Xarici səhv: Fayl əməliyyatı zamanı problem baş verdi - " + e.getMessage());
        }
    }
}
