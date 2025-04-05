package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "API");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Böyük hərflərlə sözlər: " + upperCaseWords);
    }
}
