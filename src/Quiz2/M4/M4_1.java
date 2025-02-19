package Quiz2.M4;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Arrays;
import java.util.Scanner;

public class M4_1 {

    /**İstifadəçidən 6 ədəd daxil edin və bu ədədləri kiçikdən böyüyə
     *  doğru sıralayın. (Bunu etmək üçün sort metodundan istifadə edə bilərsiniz.)*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = M1_1_Arr_oper.getArr();
        Arrays.sort(arr);
        M1_1_Arr_oper.showArr(arr);
    }
}
