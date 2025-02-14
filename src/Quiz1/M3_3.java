package Quiz1;

import java.util.Scanner;

public class M3_3 {


    /**
     * Bir ədəd alın və bu ədədə qədər olan bütün
     * ədədlərin faktorialını hesablamaq üçün bir proqram yazın.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin!");
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b*=i;
        }
        System.out.println("Daxil etdiyiniz ədədin faktorialı " + b);
    }
}
