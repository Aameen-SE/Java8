package lambda;

import java.util.function.Function;

//Write a lambda expression to calculate the factorial of a number.
public class FactorialOfNum {

    public static void main(String[] args) {

        int num =6;

        Function<Integer,Integer> factorial = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return (n<=1)?1:n*this.apply(n-1);
            }
        };

        System.out.println("Factorial of the num : "+num+" : "+factorial.apply(num));
    }
}
