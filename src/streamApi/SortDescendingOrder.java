package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDescendingOrder {
    //Use streams to sort a list of integers in descending order.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,1,3,14,15,16);
        List<Integer> sortedDesc = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedDesc);
    }
}
