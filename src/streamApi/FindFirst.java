package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        //From a list of integers, find the first number greater than 50 using streams.

        List<Integer> numbers = Arrays.asList(10, 25, 60, 45, 75, 30);

        Optional<Integer> first = numbers.stream().filter(e->e>50).findFirst();

        if(first.isPresent()){
            System.out.println("Number first Integer greater than 50 is "+first.get());
        }
        else
            System.out.println("No number is greater than 50 ");
    }
}
