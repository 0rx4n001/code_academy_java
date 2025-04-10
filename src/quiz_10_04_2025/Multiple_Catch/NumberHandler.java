package quiz_10_04_2025.Multiple_Catch;

public class NumberHandler {
    public static void checkNumberFormat(String input) throws NumberFormatException {
        int number = Integer.parseInt(input);
        System.out.println("Daxil edilən rəqəm: " + number);
    }
}
