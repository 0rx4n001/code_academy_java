package quiz_10_04_2025.Throw;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İstifadəçi adını daxil edin: ");
        String username = scanner.nextLine();
        try {
            UsernameValidator.validateUsername(username);
        } catch (IllegalArgumentException e) {
            System.out.println("Səhv: " + e.getMessage());
        }
    }
}
