package lambda;

import java.util.Scanner;
import java.util.function.Predicate;

//Write a lambda expression to check whether a given number is even or Not.
public class CheckEvenOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Even or not?");
        int num = sc.nextInt();

        Predicate<Integer> isEven = (n)-> n%2==0;
        System.out.println("IsEven : "+isEven.test(num));

    }
}
