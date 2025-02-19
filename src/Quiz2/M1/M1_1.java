package Quiz2.M1;

import java.util.Scanner;


public class M1_1 {

    /**
     * Məsələ 1:
     * İstifadəçidən 5 ədəd daxil edin və bu ədədlərin toplamını
     * və orta qiymətini hesablayan bir proqram yazın.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = M1_1_Arr_oper.getArr();
        System.out.println("Hansı əməliyyatı icra etmək istəyirsiniz? + (ədədlərin toplamı) və ya / (orta qiymət)");
        char op = scanner.next().charAt(0);
        if (op == ('+')) {
            int sum = M1_1_Arr_oper.cemiHesabla(numbers);
            System.out.println("Massivin cəmi: " + sum);
        } else if (op == ('/')) {
            double average = M1_1_Arr_oper.edediOrta(numbers);
            System.out.println("Massivin ədədi ortası: " + average);
        } else {
            System.out.println("Yanlış seçim! Yalnız 'toplama' və ya 'ədədi orta' daxil edə bilərsiniz.");
        }

        scanner.close();
    }


}
