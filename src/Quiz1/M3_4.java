package Quiz1;
import java.util.Scanner;
public class M3_4 {

    /**İstifadəçidən bir ədəd alın və həmin ədədin hər bir
     * rəqəmini ayrı-ayrılıqda ekrana yazdırın.
     * (Məsələn: 345 daxil edildikdə, 3, 4, 5 yazdırılmalıdır.)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin:");
        int num = scanner.nextInt();

        String numStr = Integer.toString(num);

        System.out.println("Daxil edilən ədədin rəqəmləri:");
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }

        scanner.close();
    }
}
