package lambda;

import java.util.Scanner;
import java.util.function.Function;

public class ReverseString {

    public static void main(String[] args) {
// use lambda expression to reverse a given string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        Function<String,String> reverse = (rev)-> new StringBuilder(rev).reverse().toString();

        System.out.println(reverse.apply(input));
    }
}
