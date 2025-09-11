package lambda;

//Write a lambda expression to print all elements of a list.
import java.util.Arrays;
import java.util.List;

public class PrintAllElement {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,23,45,67,88);
        numbers.forEach((e) -> System.out.println(e));
    }
}
