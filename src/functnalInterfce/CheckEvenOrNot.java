package functnalInterfce;

import java.util.Scanner;
import java.util.function.Predicate;

//Use a Predicate<Integer> to check if a number is even.

public class CheckEvenOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        Predicate<Integer> isEven = (n)-> n % 2 == 0;

        System.out.println("The given number is even ? :"+isEven.test(num));
    }
}
