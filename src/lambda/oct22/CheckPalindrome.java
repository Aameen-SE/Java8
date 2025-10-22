package lambda.oct22;

import java.util.function.Predicate;

public class CheckPalindrome {
    public static void main(String[] args) {

        String str = "madam";

        Predicate<String> isPalindrome = s -> {
            String rev = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(rev);
        };

        if(isPalindrome.test(str))
            System.out.println("IS palindrome ");
        else
            System.out.println("not a palindrome");
    }
}
