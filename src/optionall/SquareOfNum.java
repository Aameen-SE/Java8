package optionall;

import java.util.Optional;

public class SquareOfNum {
    public static void main(String[] args) {
        //Create an Optional<Integer> and use map() to square the number

        Optional<Integer> num = Optional.of(12);
        Optional<Integer> square = num.map((e)->e*e);
        System.out.println("Square of the given num :"+square.orElse(0));

    }
}
