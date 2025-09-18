package functnalInterfce;

import java.util.function.Function;

public class ConvertIntoStrng {
    //Write a Function<Integer, String> that converts an integer to its string representation.
    public static void main(String[] args) {
        int num= 67;

        Function<Integer,String> convert = e -> String.valueOf(e);
        System.out.println("Convert the integer :"+num+" into String is :"+convert.apply(num));
    }
}
