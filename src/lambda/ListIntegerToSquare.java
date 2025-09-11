package lambda;
//Use a lambda expression to convert a list of integers into their squares.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntegerToSquare {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(12,13,14,15);
       // number.forEach(e-> System.out.print(e*e+" ; "));

        List<Integer> squares = number.stream()
                .map(e->e*e)
                .collect(Collectors.toList());

        System.out.println("Square List : "+squares);
    }
}
