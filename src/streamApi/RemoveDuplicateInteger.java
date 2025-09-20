package streamApi;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateInteger {
    public static void main(String[] args) {

        //Remove duplicates from a list of integers using streams.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        List<Integer> uniqueNumber =numbers.stream().distinct().toList();
        System.out.println("Original Number :"+numbers);
        System.out.println("After removing duplicate : "+uniqueNumber);
    }
}
