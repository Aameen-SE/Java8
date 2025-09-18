package functnalInterfce;

import java.util.function.Predicate;

public class CheckNumIsPositve {

    public static void main(String[] args) {
        //Use a Predicate<Integer> with negate() to check if a number is not positive.

        int num =-123;

        Predicate<Integer> positiveNum = n->n>0;
        Predicate<Integer> negativeNum = positiveNum.negate();

        System.out.println("Is the given number is negative? :"+negativeNum.test(num));
    }
}
