package streamApi;

import java.util.Arrays;
import java.util.List;

public class SquareEachNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,13,4,5,6);

        List<Integer> squareNum = numbers.stream().map(e->e*e).toList();
        System.out.println("Suqare List :"+squareNum);
    }
}
