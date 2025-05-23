package quiz_04_04_2025.Stream_api.t1.t2.t1.t1.t1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Aysel", "Nigar", "Eli");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
