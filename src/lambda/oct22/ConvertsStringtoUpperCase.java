package lambda.oct22;


import java.util.Arrays;
import java.util.List;

public class ConvertsStringtoUpperCase {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "kiwi");

       fruits.stream().map(e->e.toUpperCase()).forEach(System.out::println);

    }
}
