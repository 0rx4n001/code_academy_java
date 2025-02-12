package Quiz1;

public class M8 {

    /**
     * 1-dən 100-ə qədər olan bütün tək ədədləri ekrana yazdırın.*/
    public static void main(String[] args) {
        System.out.println("1-dən 100-ə qədər olan bütün tək ədədlər:");

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i + " ");
        }
    }
}
