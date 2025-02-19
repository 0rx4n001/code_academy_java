package Quiz2.M2;

import Quiz2.M1.M1_1_Arr_oper;

/**
 * Bir massiv yaradın və həmin massivdəki ədədlərin tərsinə
 * çevrilmiş halını ekrana yazdırın.
 * (Array-in tərsinə çevrilməsi üçün əlavə bir massiv yaradılmasın.)
 */

public class M2_3 {
    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();
        M1_1_Arr_oper.showArr(M1_1_Arr_oper.getreversedArr(numbers));
    }


}
