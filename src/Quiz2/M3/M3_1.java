package Quiz2.M3;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Scanner;

public class M3_1 {

    /**
     * İstifadəçidən 10 ədəd daxil edin və həmin massivdə
     * istənilən bir ədədin olub olmadığını tapın. Əgər varsa,
     * "Ədəd tapıldı" mesajını, yoxdursa "Ədəd tapılmadı" mesajını yazdırın.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin neçə elementi olsun? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        M1_1_Arr_oper.massivDoldur(numbers);

        System.out.println("Axtarış etmək istədiyiniz ədədi daxil edin: ");
        int j = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == j) {
                System.out.print(numbers[i] + " massivin " + (++i) + "-ci elementidir");
            }
        }
    }
}
