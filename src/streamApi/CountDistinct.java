package streamApi;

import java.util.Arrays;
import java.util.List;

public class CountDistinct {
    public static void main(String[] args) {
        //Count the number of distinct words in a list.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        long num = numbers.stream().
        distinct().count();

        System.out.println("Number of the distinct in the list : "+num);
    }
}
