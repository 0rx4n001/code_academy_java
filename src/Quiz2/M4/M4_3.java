package Quiz2.M4;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M4_3 {

    /**
     * Bir massivdəki ədədləri əks sıralama (böyükdən kiçiyə) ilə düzün.
     * Bunu for dövrəsi və ya sort metodunu istifadə edərək həyata keçirin.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = M1_1_Arr_oper.getArr();
        Arrays.sort(arr);
        System.out.println("Artan sıra üçün + , Azalan sıra üçün - daxil edin!");
        char ch = sc.next().charAt(0);
        if (ch == '+') {
            M1_1_Arr_oper.showArr(arr);
        }else{
            M1_1_Arr_oper.getreversedArr(arr);
            M1_1_Arr_oper.showArr(arr);
        }

    }
}
