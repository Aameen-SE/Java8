package optionall;

import java.util.Optional;

public class Prog1 {
    public static void main(String[] args) {
        //Create an Optional from a non-null string "Java" and print its value

        Optional<String> str = Optional.of("Java");
        System.out.println("Str value :"+str.get());
    }
}
