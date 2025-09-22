package streamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfValueInList {

    public static void main(String[] args) {
//Given a list of numbers, use reduce() to find their sum.

        List<Integer> numbers = Arrays.asList(12,13,14,34,56,76,89,90);

       int sum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of the value of the given number in List is :"+sum);
    }
}
