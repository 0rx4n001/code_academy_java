package Quiz2.M2;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Scanner;

public class M2_1 {

    /**
     * İstifadəçidən 5 ədəd alın və bu ədədləri tərsinə yazdıran bir proqram yazın.
     * (Məsələn, 1, 2, 3, 4, 5 daxil edildikdə, nəticə 5, 4, 3, 2, 1 olacaq.)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivə neçə ədəd daxil etmək istəyirsiniz? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        M1_1_Arr_oper.massivDoldur(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }
}
