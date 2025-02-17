package Quiz2.M3;

import Quiz2.M1.M1_1_Arr_oper;

import java.util.Scanner;

public class M3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin neçə elementi olsun? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        M1_1_Arr_oper.massivDoldur(numbers);
        int[] oddNumbers = M1_1_Arr_oper.getOddNums(numbers);
        System.out.println("Massivin tək ədədləri: ");
        M1_1_Arr_oper.showArr(oddNumbers);
    }
}
