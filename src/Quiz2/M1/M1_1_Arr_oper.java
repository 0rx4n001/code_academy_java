package Quiz2.M1;

import java.util.Scanner;

public class M1_1_Arr_oper {
    public static int[] getArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massivin neçə elementi olsun? ");
        int n = sc.nextInt();

        int[] newArray = new int[n];
        System.out.println(n + " ədəd daxil edin:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ədəd: ");
            newArray[i] = sc.nextInt();
        }

        return newArray;
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

    public static int[] getreversedArr(int[] numbers) {
        int[] temparr = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            temparr[index++] = numbers[i];
        }
        return temparr;
    }


    public static void sortArr(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }



}
