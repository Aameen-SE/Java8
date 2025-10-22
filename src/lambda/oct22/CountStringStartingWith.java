package lambda.oct22;

import java.util.Arrays;
import java.util.List;

public class CountStringStartingWith {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen", "John", "Alice", "Bob");

        long count = names.stream().filter(e->e.startsWith("A")).count();
        System.out.println("Number of elements start with A :-> "+count);
    }
}
