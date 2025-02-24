package Quiz2.M3;

import Quiz2.M1.M1_1_Arr_oper;

public class M3_3 {

    /**
     * Bir massivdə və ya növbəti ən böyük və ən kiçik ədədi tapın.
     * Məsələn, əgər massivdə 3, 5, 7, 9 ədədləri varsa, ən kiçikdən
     * sonra ən kiçik olan 5 olmalıdır.
     */
    public static void main(String[] args) {
        int[] arr = M1_1_Arr_oper.getArr();
        M1_1_Arr_oper.sortArr(arr);
        if (arr[0] == arr[1]) {
            System.out.println("Massivin 2 eyni ən kiçik elementi var. Ən kiçik element: " + arr[0] + " Növbəti ən kiçik isə " + arr[2]);
        } else {
            System.out.println("Massivin ikinci ən kiçik elementi: " + arr[1]);
        }
    }


}

