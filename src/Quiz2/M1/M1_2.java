package Quiz2.M1;

import java.util.Scanner;

public class M1_2 {

    /**
     * İstifadəçidən 10 ədəd daxil edin və bu ədədlərin ən böyüyünü və ən kiçiyini tapın.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivə neçə ədəd daxil etmək istəyirsiniz?");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        M1_1_Arr_oper.massivDoldur(numbers);
        int[] minMax = M1_1_Arr_oper.findMinMax(numbers);
        System.out.println("Massivin ən kiçik elementi: " + minMax[0] + " Massivin ən böyük elementi: " + minMax[1]);
    }
}

