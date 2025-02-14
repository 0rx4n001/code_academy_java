package Quiz1;

import java.util.Scanner;

public class M5_1 {
    /**
     * Məsələ 1:
     * İstifadəçidən bir şifrə daxil etməsini istəyin.
     * Şifrə doğru daxil edilənə qədər bu prosesi təkrarlayın.
     * Şifrə düzgün olduqda "Giriş uğurla tamamlandı" mesajını yazdırın.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Şifrəni daxil edin: ");
            num = scanner.nextInt();
        } while (num != 777);
        System.out.println("Şifrə düzgündür");
        scanner.close();
    }
}
