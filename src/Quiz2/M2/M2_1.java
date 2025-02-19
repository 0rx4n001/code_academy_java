package Quiz2.M2;

import Quiz2.M1.M1_1_Arr_oper;

public class M2_1 {

    /**
     * İstifadəçidən 5 ədəd alın və bu ədədləri tərsinə yazdıran bir proqram yazın.
     * (Məsələn, 1, 2, 3, 4, 5 daxil edildikdə, nəticə 5, 4, 3, 2, 1 olacaq.)
     */
    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();
        int[] temparr = M1_1_Arr_oper.getreversedArr(numbers);
        M1_1_Arr_oper.showArr(temparr);

        }
    }

