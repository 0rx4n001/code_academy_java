package Quiz2.M4;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M4_2 {

    /**
     * İstifadəçidən 8 ədəd daxil edin və həmin ədədləri böyükdən kiçiyə doğru sıralayın.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = M1_1_Arr_oper.getArr();
        Arrays.sort(arr);
        M1_1_Arr_oper.getreversedArr(arr);
        M1_1_Arr_oper.showArr(arr);

    }
}
