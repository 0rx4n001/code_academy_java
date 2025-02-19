package Quiz2.M3;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Scanner;

public class M3_2 {

    /**
     * Bir massivdəki tək ədədləri tapın və ekrana yazdırın.
     * (İstifadəçi tərəfindən daxil edilmiş ədəd massivinə görə işləsin.)
     */

    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();
        int[] oddNumbers = M1_1_Arr_oper.getOddNums(numbers);
        System.out.println("Massivin tək ədədləri: ");
        M1_1_Arr_oper.showArr(oddNumbers);
    }
}
