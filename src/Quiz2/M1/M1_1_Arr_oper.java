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

    public static int[] findMinMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Massiv boşdur!");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static int[] getEvenNums(int[] arr) {

        if (arr.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[0];
        }

        int[] evenNums = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNums[index++] = arr[i];
            }
        }
        return evenNums;
    }

    public static void showArr(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Massiv boşdur!");
            return;
        }
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }

        System.out.println();
    }

    public static int[] getOddNums(int[] arr) {

        if (arr.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[0];
        }

        int[] oddNums = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNums[index++] = arr[i];
            }
        }
        return oddNums;
    }


}
