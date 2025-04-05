package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println("Bütün ədədlər cütdür? " + allEven);
    }
}
