package lambda.oct22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FilterByLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen","Adil","Rehan","Altamash");

        names.stream().filter(e->e.length()>=5).forEach(e-> System.out.print(e+" , "));
        System.out.println("===================");
        // changing to uppercase
        names.stream().map(e->e.toUpperCase()).forEach(System.out::println);

        names.sort((a,b)-> Integer.compare(a.length(),b.length()));
        System.out.println("Sorted by length :"+names);

        List<Integer> number = Arrays.asList(1,2,3,4,5);

        int sum =number.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of the given list is "+sum);

        // reverse a string

        String str = "Aameen";

        Function<String,String> rev = s-> new StringBuilder(s).reverse().toString();
        String reverse = rev.apply(str);
        System.out.println("Reverse of the given String is :"+reverse);
    }
}
