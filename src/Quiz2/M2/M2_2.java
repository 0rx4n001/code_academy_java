package Quiz2.M2;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Scanner;

public class M2_2 {

    /**
     * İstifadəçidən bir ədəd daxil edin və 1-dən həmin ədədə qədər olan
     * bütün ədədlərin tərs sırada massivə əlavə edildiyi bir proqram yazın.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proqramdan çıxmaq üçün 0 daxil edin. Ədədi daxil edin: ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }


            int[] reversedNumber = new int[n];
            int index = 0;
            for (int i = n - 1; i >= 0; i--) {
                reversedNumber[index++] = i + 1;
            }
            M1_1_Arr_oper.showArr(reversedNumber);
        }
    }
}
