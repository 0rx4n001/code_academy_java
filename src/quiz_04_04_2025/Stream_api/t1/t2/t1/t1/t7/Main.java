package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t7;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");

        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println("Baş hərfinə görə qruplaşdırılmış map: " + groupedByFirstLetter);
    }
}
