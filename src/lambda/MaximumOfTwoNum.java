package lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class MaximumOfTwoNum {
//Write a lambda expression to find the maximum of two numbers.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int firstNum = sc.nextInt();

        System.out.println("Enter the second num :");
        int secondNum = sc.nextInt();

        BiFunction<Integer,Integer,Integer> result = (a1,a2)->(a1>a2)?a1:a2;
        System.out.println("Maximum number between two is :"+result.apply(firstNum,secondNum));
    }
}
