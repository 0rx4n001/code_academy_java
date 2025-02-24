package Quiz2.M5;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M5_1 {

    /**
     * İstifadəçidən iki ədəd massiv daxil edin (hər biri 5 ədəd olmalıdır).
     * Hər iki massivdəki ədədləri bir-biri ilə mübadilə edin
     * (yəni, massivlərin elementlərini dəyişdirin).
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = M1_1_Arr_oper.getArr();
        int[] arr2 = M1_1_Arr_oper.getArr();
        System.out.println("Massivlərin yerdəyişmədən öncəki vəziyyəti.");
        System.out.println("1-ci Massiv" + Arrays.toString(arr1));
        System.out.println("2-ci Massiv" + Arrays.toString(arr2));
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        } else {
            throw new IllegalArgumentException("Massivlərin ölçüləri fərqlidir!");
        }
        System.out.println("Massivlərin yerdəyişmədən sonrakı vəziyyəti.");
        System.out.println("1-ci Massiv" + Arrays.toString(arr1));
        System.out.println("2-ci Massiv" + Arrays.toString(arr2));

    }
}
