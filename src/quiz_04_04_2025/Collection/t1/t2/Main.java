package quiz_04_04_2025.Collection.t1.t2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b", "a");


        HashMap<String, Integer> countMap = new HashMap<>();


        for (String word : list) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " dəfə");
        }
    }
}
