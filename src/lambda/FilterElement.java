package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterElement {

    //Use a lambda expression to filter out all numbers less than 10 from a list.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,3,4,5,6,78,90,3);
        List<Integer> resultlIst = numbers.stream()
                .filter((e)->e<10).collect(Collectors.toList());

        System.out.println("Filter number which is less than 10 :"+resultlIst);
    }
}
