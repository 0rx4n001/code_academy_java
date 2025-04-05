package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t5;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        String result = nums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println("Nəticə: " + result);
    }
}
