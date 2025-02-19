package Quiz2.M1;

public class M1_3 {

    /**
     * İstifadəçidən 7 ədəd daxil edin və daxil olunan
     * ədədlərin cüt olanlarını tapın və ekrana yazdırın.
     */


    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();
        int[] evenNumbers = M1_1_Arr_oper.getEvenNums(numbers);
        System.out.println("Massivin cüt ədədləri: ");
        M1_1_Arr_oper.showArr(evenNumbers);

    }
}
