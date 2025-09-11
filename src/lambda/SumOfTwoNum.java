package lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SumOfTwoNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNum = sc.nextInt();

        System.out.println("Enter the second number :");
        int secondNum = sc.nextInt();

        BiFunction<Integer,Integer,Integer> sum = (a,b) ->a+b;

        System.out.println("Sum of the given two number is : "+sum.apply(firstNum,secondNum));
    }
}
