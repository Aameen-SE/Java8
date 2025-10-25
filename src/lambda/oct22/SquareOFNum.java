package lambda.oct22;

import java.util.Arrays;
import java.util.List;

public class SquareOFNum {
    public static void main(String[] args) {
        //2. Square of Numbers

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        numbers.forEach(
                e-> System.out.println(e+" : "+e*e));
    }
}
