package lambda;

import java.util.Scanner;
import java.util.function.Function;

public class SquareRootOfNum {
    public static void main(String[] args) {
// find the square root of the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double num = sc.nextInt();

        Function<Double,Double> squareOfNum = (n)->Math.sqrt(n);

        System.out.println("The squareRoot of given number is "+squareOfNum.apply(num));
    }
}
