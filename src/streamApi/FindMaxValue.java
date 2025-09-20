package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMaxValue {

    public static void main(String[] args) {
        //Given a list of integers, use streams to find the maximum value.

        List<Integer> numbers = Arrays.asList(12,13,14,34,56,76,89,90);

       int max =  numbers.stream().max(Integer::compare).orElseThrow(NoSuchElementException::new);
        System.out.println("The maximum value in the List : "+max);
    }
}
