package Quiz2.M2;

import Quiz2.M1.M1_1_Arr_oper;

public class M2_4 {

    /**
     * İstifadəçidən 6 ədəd daxil edin və bu ədədləri tərsinə sıralayıb ekrana yazdırın.
     * (Bunun üçün for dövrəsi və ya başqa bir üsul istifadə edin.)
     */


    public static void main(String[] args) {
        int[] arr = M1_1_Arr_oper.getArr();
        int[] arr2 = M1_1_Arr_oper.getreversedArr(arr);
        M1_1_Arr_oper.showArr(arr2);
    }
}
