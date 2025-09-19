package functnalInterfce;

import java.util.function.Function;

public class ConvertUpperCase {
    public static void main(String[] args) {
        //Write a Function<String, String> that converts a string to uppercase.

        String str = "Rahul";

        Function<String,String> convertUpper = e->e.toUpperCase();
        System.out.println("The given string into upppercase :"+convertUpper.apply(str));
    }
}
