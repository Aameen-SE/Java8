package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNUm {

    public static void main(String[] args) {
        //Given a list of integers, use streams to print only the even numbers.

        List<Integer> numbers = Arrays.asList(12,13,14,15,16,27,28);

        List<Integer> evenNumber = numbers.stream().filter(e->e%2==0).toList();
        System.out.println(evenNumber);
    }
}
