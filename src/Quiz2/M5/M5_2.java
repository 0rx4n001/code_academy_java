package Quiz2.M5;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M5_2 {

    /**
     * Bir massiv yaradın və həmin massivdəki hər bir ədədin yerini dəyişin
     * (məsələn, ilk və sonuncu elementi mübadilə edin,
     * sonra ikinci və sondan birinci elementi və s.).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = M1_1_Arr_oper.getArr();
        System.out.println("Massivin yerdəyişmədən öncəki vəziyyəti.");
        System.out.println("Massiv" + Arrays.toString(arr));
        arr = M1_1_Arr_oper.getreversedArr(arr);
        System.out.println("Massivin yerdəyişmədən sonrakı vəziyyəti.");
        System.out.println("Massiv" + Arrays.toString(arr));

    }
}
