package Quiz1;

import java.util.Scanner;

public class M12 {

    /**
     * İstifadəçidən bir ədəd alın və bu ədədin asal olub olmadığını yoxlayın. Əgər asal ədədirsə,
     * "Asal ədəddir", əks halda "Asal ədəd deyil" mesajını yazdırın.
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yoxlamaq istədiyiniz ədədi daxil edin!");
        int num3 = scanner.nextInt();
        int num4 = 0;
        int i = 1;

        while (i <= num3) {
            if (num3 % i == 0) {
                ++num4;
            }
            i++;
        }

        if (num4 > 2) {
            System.out.println("Daxil edilən ədəd mürəkkəb ədəddir!");
        } else {
            System.out.println("Daxil edilən ədəd sadə ədəddir!");
        }

        scanner.close();
    }
}
