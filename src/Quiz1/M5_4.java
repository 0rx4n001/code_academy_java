package Quiz1;

import java.util.Scanner;

public class M5_4 {
    /**
     * Məsələ 4:
     * Bir neçə ədəd daxil edin və bu ədədlərdən hansının ən
     * kiçik olduğunu tapın. İstifadəçi sıfır daxil etdikdə dövrə dayansın.
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
            if (x < y) {
                System.out.println("Ən kiçik ədəd: " + x);
            } else if (x == y) {
                System.out.println("Bu ədədlər bərabərdir!");
            } else {
                System.out.println("Ən kiçik ədəd: " + y);
            }
        }
        while (x != 0 && y != 0);
        System.out.println("0 daxil etdiyiniz üçün proses sonlandı!");
        sc.close();
    }
}
