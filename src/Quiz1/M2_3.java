package Quiz1;
import java.util.Scanner;
public class M2_3 {
/**
 * İstifadəçidən iki ədəd və bir əməliyyat işarəsi (+, -, *, /) alın.
 * Bu əməliyyatı yerinə yetirin və nəticəni yazdırın. Əgər istifadəçi səhv
 * əməliyyat işarəsi daxil edərsə, "Yanlış əməliyyat" mesajını yazdırın.*/

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("İlk ədədi daxil edin!");
    double num1 = scanner.nextDouble();
    System.out.println("İkinci ədədi daxil edin!");
    double num2 = scanner.nextDouble();
    System.out.println("+, *, / və - əməliyyatlarından birini daxil edin!");
    char ch1 = scanner.next().charAt(0);
    double result;
    boolean err = true;

    switch (ch1) {
        case '+':
            result = num1 + num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 !=0 ){
                result = num1 / num2;}
            else {System.out.println("Xəta: 0-a bölmək mümkün deyl!");
                err = false;
                result = 0;}
            break;
        case '-':
            result = num1 - num2;
            break;
        default:
            System.out.println("Xəta: Yanlış əməliyyat simvolu daxil edilib!");
            err = false;
            result = 0;
    }
    if (err) {
        System.out.println("Nəticə: " + result);
    }

    scanner.close();
}
}
