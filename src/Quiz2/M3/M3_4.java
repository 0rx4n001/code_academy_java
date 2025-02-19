package Quiz2.M3;

import Quiz2.M1.M1_1_Arr_oper;

public class M3_4 {

    /**
     * İstifadəçidən 10 ədəd daxil edin və bu ədədlərdən
     * yalnız unikal olanları tapın (təkrarlanan ədədləri nəzərə almayın).
     */


    public static void main(String[] args) {
        int[] arr = M1_1_Arr_oper.getArr();
        M1_1_Arr_oper.sortArr(arr);

        int[] temp = new int[arr.length];
        int index = 0;


        temp[index++] = arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        M1_1_Arr_oper.showArr(result);
    }
}
