package Quiz1;

import java.util.Scanner;

public class M4_4 {
    /**
     * Məsələ 4:
     * Bir neçə ədəd daxil edin və bu ədədlərin cəmindən sonra onların
     * ortalamasını hesablayan bir proqram yazın. İstifadəçi sıfır daxil
     * edərək prosesi sonlandırsın.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Neçə ədəd daxil etmək istəyirsiniz? (Dayandırmaq üçün 0): ");
            int count = scanner.nextInt();

            if (count == 0) {
                System.out.println("Proqram dayandırıldı.");
                break;
            }

            int sum = 0, i = 0;

            while (i < count) {
                System.out.print((i + 1) + ". ədədi daxil edin: ");
                int num = scanner.nextInt();
                sum += num;
                i++;
            }

            double average = (double) sum / count;
            System.out.println("Daxil edilən ədədlərin ədədi ortası: " + average);
        }

        scanner.close();
    }
}

