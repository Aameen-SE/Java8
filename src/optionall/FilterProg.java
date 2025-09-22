package optionall;

import java.util.Optional;

public class FilterProg {
    public static void main(String[] args) {
        //Create an Optional<String> and use filter() to check if it starts with "A"

        Optional<String> fruits = Optional.of("Apple");
        Optional<String> result = fruits.filter((e)->e.startsWith("A"));
        System.out.println("Values Start with A :"+result.orElse("No Such Values Start with A"));

        Optional<String> fruits1 = Optional.of("Mango");
        Optional<String> result1 = fruits1.filter((e)->e.startsWith("A"));
        System.out.println("Values Start with A :"+result1.orElse("No Such Values Start with A"));

    }
}
