package Quiz1;

import java.util.Scanner;

public class M9 {


    /**
     * İstifadəçidən bir ədəd alın və həmin ədədə qədər
     * olan bütün ədədlərin cəmini hesablayan
     * bir proqram yazın.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin!");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i < a; i++) {
          b+=i;
        }
        System.out.println("Daxil etdiyiniz ədədə qədər olan ədədlərin cəmi: " + b);
    }
}
