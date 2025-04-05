package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t8;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        long count = list.stream()
                .filter(word -> word.length() > 5)
                .count();

        System.out.println("Uzunluğu 5-dən böyük olan sözlərin sayı: " + count);
    }
}
