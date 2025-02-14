package Quiz1;

import java.util.Scanner;

public class M5_3 {
    /**
     * Məsələ 3:
     * İstifadəçidən ardıcıl olaraq ədədlər alın və bunların
     * daxilindəki ən böyük ədədi tapın. İstifadəçi 0
     * daxil etdikdə dövrə dayansın.
     */

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hesablama aparmaq üçün iki ədəd daxil etməlisiniz. 0 daxil edilərsə proses bitəcək!");
            System.out.println("Birinci ədədi daxil edin!");
            x = sc.nextInt();
            System.out.println("İkinci ədədi daxil edin!");
            y = sc.nextInt();
            if (x > y) {
                System.out.println("Ən böyük ədəd: " + x);
            } else if (x == y) {
                System.out.println("Bu ədədlər bərabərdir!");
            } else {
                System.out.println("Ən böyük ədəd: " + y);
            }
        }
        while (x != 0 && y != 0);
        System.out.println("0 daxil etdiyiniz üçün proses sonlandı!");
        sc.close();
    }
}
