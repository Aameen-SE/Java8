package lambda.oct22;

//Write a lambda expression to print all elements of a given List<String>.

import java.util.Arrays;
import java.util.List;

public class PrintAllElement {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen", "John", "Alice");

        names.forEach(e-> System.out.println(e));
    }
}
