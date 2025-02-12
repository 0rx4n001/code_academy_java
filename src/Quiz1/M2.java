package Quiz1;

import java.util.Scanner;

public class M2 {
    /**
     * Məsələ 2:
     * Bir ədəd alın və həmin ədədin sadə, ya da mürəkkəb olduğunu yoxlayan bir proqram yazın.
     */
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Yoxlamaq istədiyiniz ədədi daxil edin!");
        int num3 = scanner2.nextInt();
        int num4 = 0;
        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                ++num4;
            }
        }
        if (num4 > 2) {
            System.out.println("Daxil edilən ədəd mürəkkəb ədəddir!");
        } else {
            System.out.println("Daxil edilən ədəd sadə ədəddir!");
        }
    }
}
