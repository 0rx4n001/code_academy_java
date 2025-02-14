package Quiz1;





import java.util.Scanner;

public class M2_2 {

    /**
     * İstifadəçidən bir məktub (A, B, C, D və s.) alın və
     * bu məktubun qiymət dərəcəsini yazdırın
     * (A - Əla, B - Yaxşı, C - Kafi, D - Zəif).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A, B, C, D və E hərflərinə uyğun məktubunuzu daxil edin!");
        char letter = sc.next().charAt(0);
        String evaluation;
        switch (letter) {
            case 'A':
                evaluation = "Əla";
                break;
            case 'B':
                evaluation ="Yaxşı";
                break;
            case 'C':
                evaluation = "Kafi";
                break;
            case 'D':
                evaluation = "Zəif";
                break;
            case 'E':
                evaluation = "Qeyri kafi";
                break;
            default:
                evaluation = "Düzgün məktub daxil edilməyib!";

        }
        System.out.println(evaluation);
        sc.close();
    }

}
