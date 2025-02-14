package Quiz1;

import java.util.Scanner;

public class M1_3 {

    /**
     * Məsələ 3:
     * Bir ədəd alın və həmin ədədin tək, ya da cüt olduğunu yoxlayan bir proqram yazın.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yoxlamaq istədiyiniz ədədi daxil edin!");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Bu ədəd cüt ədəddir!");
        } else {
            System.out.println("Bu ədəd tək ədəddir!");
        }
    }
}
