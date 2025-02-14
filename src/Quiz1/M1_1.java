package Quiz1;

import java.util.Scanner;

public class M1_1 {

    /**
     * Məsələ 1:
     * İstifadəçidən iki ədəd alın və bu ədədlərin bir-birinə bərabər olub-olmamasını yoxlayın.
     * Əgər bərabərsə, "Ədədlər bərabərdir" mesajını, əks halda "Ədədlər bərabər deyil" mesajını yazdırın.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci ədədi daxil edin");
        int num1 = scanner.nextInt();

        System.out.println("Ikinci ədədi daxil edin");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Ədədlər bərabərdir");
        } else {
            System.out.println("Ədədlər bərabər deyl!");
        }

        scanner.close();

    }
}
