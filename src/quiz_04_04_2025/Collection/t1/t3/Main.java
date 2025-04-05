package quiz_04_04_2025.Collection.t1.t3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);


        List<Integer> commonElements = new ArrayList<>(list1);

        commonElements.retainAll(list2);


        System.out.println("Ortaq elementlər: " + commonElements);
    }
}
