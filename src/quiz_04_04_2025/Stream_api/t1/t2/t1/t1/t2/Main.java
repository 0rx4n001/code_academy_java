package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Tək ədədlərin kvadratları: " + result);
    }
}
