package lambda;

import java.util.Arrays;
import java.util.List;

public class PrintEachELement {
// write lambda expression to print each element
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(12,13,14,15);

        number.forEach(e-> System.out.println(e));
    }
}
