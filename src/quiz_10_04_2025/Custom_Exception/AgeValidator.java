package quiz_10_04_2025.Custom_Exception;

import java.util.Scanner;

public class AgeValidator {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Yaş 18-dən azdır! Giriş icazəsi verilmir.");
        } else {
            System.out.println("Access granted");
        }
    }
    public static int getAgeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı daxil edin: ");
        return scanner.nextInt();
    }
}
