package quiz_10_04_2025.Throws_method;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileHandler.readFile("C:\\Users\\Hp-Account\\Desktop\\mytxt.txt");
        } catch (IOException e) {
            System.out.println("Səhv: Fayl oxunarkən problem yarandı - " + e.getMessage());
        }
    }
}


