package Quiz1;

import java.util.Scanner;

public class M4_2 {

    /**
     * Məsələ 2:
     * İstifadəçidən bir ədəd alın və bu ədədə qədər olan bütün müsbət
     * tam ədədlərin cəmini hesablayın. (0 daxil edilənə qədər davam etsin.)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bir ədəd daxil edin (dayandırmaq üçün 0): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Proqram dayandırıldı.");
                break;
            }

            int sum = 0;
            int i = 1;

            while (i <= number) {
                sum += i;
                i++;
            }

            System.out.println(number + " ədədinə qədər olan ədədlərin cəmi: " + sum);
        }

        scanner.close();
    }
}

