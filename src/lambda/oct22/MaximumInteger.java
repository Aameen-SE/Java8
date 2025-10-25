package lambda.oct22;

import java.util.Arrays;
import java.util.List;

public class MaximumInteger {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,56,12,34,560,78);
        int max = numbers.stream().reduce(0,(a,b)->Integer.max(a,b));

        System.out.println("Maximum integer in the list : "+max);
    }
}
