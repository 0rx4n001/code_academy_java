package Quiz2.M1;

public class M1_4 {

    /**
     * Bir massiv yaradın (məsələn, int[] numbers = {1, 2, 3, 4, 5}) və həmin massivdəki
     * bütün ədədlərin kvadratlarını hesablayıb ekrana yazdırın.
     */


    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        M1_1_Arr_oper.showArr(numbers);

    }
}
