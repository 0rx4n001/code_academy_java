package Quiz2.M1;

import java.util.Scanner;

public class M1_4 {

    /**
     * Bir massiv yaradın (məsələn, int[] numbers = {1, 2, 3, 4, 5}) və həmin massivdəki
     * bütün ədədlərin kvadratlarını hesablayıb ekrana yazdırın.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivə neçə ədəd daxil etmək istəyirsiniz? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        M1_1_Arr_oper.massivDoldur(numbers);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        M1_1_Arr_oper.showArr(numbers);

    }
}
