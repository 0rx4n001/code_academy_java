package Quiz2.M5;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M5_4 {

    /**
     * Bir massivdəki iki ədədin yerini dəyişin. İstifadəçidən massivdə iki index daxil edin və
     * həmin indexlərdəki ədədləri bir-birinə mübadilə edin.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = M1_1_Arr_oper.getArr();

        System.out.println("Massiv");
        System.out.println(Arrays.toString(arr));

        System.out.println("1-ci indeksi daxil et");
        int index1 = sc.nextInt() - 1;
        System.out.println("2-ci indeksi daxil et");
        int index2 = sc.nextInt() - 1;

        if (index1 >= 0 && index2 >= 0 && index1 < arr.length && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.println("Yeni massiv");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Daxil etdiyiniz indekslər səhvdir!");
        }


        sc.close();

    }
}
