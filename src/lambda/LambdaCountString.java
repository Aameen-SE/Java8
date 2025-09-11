package lambda;

import java.util.Arrays;
import java.util.List;
//Write a lambda expression to count how many strings in a list have length greater than 5.
public class LambdaCountString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Mango", "Pineapple", "Kiwi", "Strawberry");

        long count = words.stream().filter(str->str.length()>5).count();

        System.out.println("Number of String greater than length 5 is :"+count);
    }
}
