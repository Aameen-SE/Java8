package functnalInterfce;
//Create a custom functional interface Calculator with a method int calculate(int a, int b)
// and use a lambda to implement addition.

import java.util.Scanner;

@FunctionalInterface
interface Calculator{
 int calculate(int a, int b);
}

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstNum :");
        int num1 = scanner.nextInt();

        System.out.println("Enter the secondNum :");
        int num2 = scanner.nextInt();

        Calculator add = (a,b)-> a+b;


        System.out.println("The sum of the given number is :"+add.calculate(num1,num2));
    }
}
