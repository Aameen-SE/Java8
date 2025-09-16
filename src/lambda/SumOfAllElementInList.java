package lambda;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElementInList {

    public static void main(String[] args) {

        //Create a list of integers and use a lambda expression to calculate the sum of all numbers.

        List<Integer> numbers = Arrays.asList(12,1,13,14,5,6,7);
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of all the element is :"+result);
    }
}
