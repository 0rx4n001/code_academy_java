package quiz_10_04_2025.try_catch;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int num2 = scanner.nextInt();
        try {
            int result = MathUtils.divide(num1, num2);
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        scanner.close();
    }
}
