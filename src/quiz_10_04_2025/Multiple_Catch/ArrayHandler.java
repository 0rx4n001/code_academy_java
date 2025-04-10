package quiz_10_04_2025.Multiple_Catch;

public class ArrayHandler {
    public static void checkArrayIndex(int index) throws ArrayIndexOutOfBoundsException {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[index]);
    }
}
