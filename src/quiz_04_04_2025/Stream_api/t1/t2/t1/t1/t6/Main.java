package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t6;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> data = Map.of(
                "A", List.of(1, 2, 3),
                "B", List.of(4, 5),
                "C", List.of(6, 7, 8, 9)
        );

        Map<String, List<Integer>> filtered = data.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList())
                ));

        System.out.println("Yalnız cüt ədədlərlə map: " + filtered);
    }
}
