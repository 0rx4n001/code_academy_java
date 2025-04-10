package quiz_10_04_2025.Multiple_Catch;

public class Main {
    public static void main(String[] args) {
        int index = InputHandler.getArrayIndexFromUser();
        try {
            ArrayHandler.checkArrayIndex(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch bloku 1: Array indeks səhvi - " + e.getMessage());
        }
        String numberInput = InputHandler.getNumberInputFromUser();
        try {
            NumberHandler.checkNumberFormat(numberInput);
        } catch (NumberFormatException e) {
            System.out.println("Catch bloku 2: Rəqəm formatı səhvi - " + e.getMessage());
        }
    }
}
