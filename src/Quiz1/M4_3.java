package Quiz1;

import java.util.Scanner;


public class M4_3 {

    /**
     * Kullanıcıdan bir ədəd alın və bu ədədin daxilindəki
     * rəqəmlərin cəmini tapın. (Məsələn: 567 daxil edilərsə, 5+6+7 = 18 olacaq.)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin:");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);
        scanner.close();
    }

}
