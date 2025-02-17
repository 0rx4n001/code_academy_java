package Quiz2.M1;

import java.util.Scanner;

public class M1_3 {

    /**
     * İstifadəçidən 7 ədəd daxil edin və daxil olunan
     * ədədlərin cüt olanlarını tapın və ekrana yazdırın.
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Massivə neçə ədəd daxil etmək istəyirsiniz?");

        int n = sc.nextInt();

        int[] numbers = new int[n];

        M1_1_Arr_oper.massivDoldur(numbers);

        int[] evenNumbers = M1_1_Arr_oper.getEvenNums(numbers);

        System.out.println("Massivin cüt ədədləri: ");
        M1_1_Arr_oper.showArr(evenNumbers);

    }
}
