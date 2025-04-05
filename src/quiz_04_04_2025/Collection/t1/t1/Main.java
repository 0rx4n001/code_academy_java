package quiz_04_04_2025.Collection.t1.t1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};


        HashMap<String, Integer> countMap = new HashMap<>();


        for (String fruit : fruits) {
            countMap.put(fruit, countMap.getOrDefault(fruit, 0) + 1);
        }


        String mostRepeated = "";
        int max = 0;


        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                mostRepeated = entry.getKey();
                max = entry.getValue();
            }
        }


        System.out.println("Ən çox təkrarlanan: " + mostRepeated + " (" + max + " dəfə)");
    }
}
