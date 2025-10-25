package lambda.oct22;

import java.util.Arrays;
import java.util.List;

public class MultiplyNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(e-> System.out.println(e+" - > "+e*10));
    }
}
