package Quiz2.M5;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M5_3 {

    /**
     * Bir massiv yaradın və həmin massivdəki ədədləri ikiqat artırın.
     * Məsələn, 1, 2, 3 massivini 2, 4, 6-ya çevirin.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = M1_1_Arr_oper.getArr();
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Yeni massiv");
        System.out.println(Arrays.toString(arr));

    }
}
