package Quiz1;

import java.util.Scanner;

public class M5_2 {
    /**
     * Məsələ 2:
     * İstifadəçidən bir ədəd daxil etməsini istəyin və bu ədədin kvadratını
     * hesablamağa davam edin, amma daxil edilən ədəd 0 olduqda dövrə dayansın.*/
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Kvadratını tapmaq istədiyiniz ədədi daxil edin. Çıxış üçün 0 daxil edin : ");
            x = sc.nextInt();
            x=x*x;
            System.out.println("Daxil edilən ədədin kvadratı: " + x);
        }
        while (x!=0);
        System.out.println("0 daxil etdiyiniz üçün proses sonlandı!");
        sc.close();







    }
}
