package Quiz1;

import java.util.Scanner;

public class M14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Şifrəni daxil edin!");
            num = scanner.nextInt();
        } while (num != 777);
        System.out.println("Şifrə düzgündür");
        scanner.close();
    }
}
