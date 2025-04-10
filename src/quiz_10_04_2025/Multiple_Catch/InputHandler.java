package quiz_10_04_2025.Multiple_Catch;

import java.util.Scanner;

public class InputHandler {
    public static int getArrayIndexFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array-in indeksini daxil edin (0-2): ");
        return scanner.nextInt();
    }
    public static String getNumberInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir rəqəm daxil edin: ");
        return scanner.nextLine();
    }
}
