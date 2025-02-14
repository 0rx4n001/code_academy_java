package Quiz2.M1;

import java.util.Scanner;

public class M1_1_Arr_oper {
    public static void massivDoldur(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(numbers.length + " ədəd daxil edin:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". ədəd: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public static int cemiHesabla(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double edediOrta(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

}
