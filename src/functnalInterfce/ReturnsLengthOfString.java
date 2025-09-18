package functnalInterfce;

import java.util.Scanner;
import java.util.function.Function;
//Write a Function<String, Integer> that takes a string and returns its length.
public class ReturnsLengthOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = sc.nextLine();

        Function<String,Integer> rsult = (n)->n.length();
        System.out.println("The length of the given string : "+rsult.apply(input));
    }
}
