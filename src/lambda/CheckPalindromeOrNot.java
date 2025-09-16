package lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {

        //Write a lambda expression to check if a given string is a palindrome.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String input = sc.nextLine();

        Predicate<String> isPalindrome = (str)-> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        System.out.println("Is "+input+" is palindrome ? :"+isPalindrome.test(input));


    }
}
