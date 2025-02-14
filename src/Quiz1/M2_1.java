package Quiz1;

import java.util.Scanner;

public class M2_1 {

/**İstifadəçidən bir aylıq nömrə (1-12 arası) alın və
 həmin ayın adını (Yanvar, Fevral, və s.) ekrana yazdırın.
* */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-12 aralığında bir ədəd daxil edin!");
        int month = scanner.nextInt();
        String monthName;

        switch (month) {
            case 1:
                monthName = "Yanvar";
                break;
            case 2:
                monthName = "Fevral";
                break;
            case 3:
                monthName = "Mart";
                break;
            case 4:
                monthName = "Aprel";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "İyun";
                break;
            case 7:
                monthName = "İyul";
                break;
            case 8:
                monthName = "Avqust";
                break;
            case 9:
                monthName = "Sentyabr";
                break;
            case 10:
                monthName = "Oktyabr";
                break;
            case 11:
                monthName = "Noyabr";
                break;
            case 12:
                monthName = "Dekabr";
                break;
            default:
                monthName = "Xəta: Yanlış ədəd daxil edilib!";
        }

        System.out.println("Daxil edilən ədədə uyğun ay: " + monthName);
        scanner.close();
    }
}

