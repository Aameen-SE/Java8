package functnalInterfce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintOnlyEvenFromList {

    public static void main(String[] args) {

        //Create a Consumer<List<Integer>> that prints only even numbers from the list.

        List<Integer> numbers = Arrays.asList(12,13,14,15,16);

        Consumer<List<Integer>> evenNumber = e->e.stream()
                .filter(f-> f%2==0)
                .forEach(System.out::println);

        evenNumber.accept(numbers);
    }
}
