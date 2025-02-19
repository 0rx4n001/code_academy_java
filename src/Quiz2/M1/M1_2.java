package Quiz2.M1;

public class M1_2 {

    /**
     * İstifadəçidən 10 ədəd daxil edin və bu ədədlərin ən böyüyünü və ən kiçiyini tapın.
     */

    public static void main(String[] args) {
        int[] numbers = M1_1_Arr_oper.getArr();
        int[] minMax = M1_1_Arr_oper.findMinMax(numbers);
        System.out.println("Massivin ən kiçik elementi: " + minMax[0] + " Massivin ən böyük elementi: " + minMax[1]);
    }
}

