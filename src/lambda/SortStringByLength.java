package lambda;

//Use a lambda expression to implement a comparator that sorts strings by their length.
import java.util.Arrays;
import java.util.List;

public class SortStringByLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen","Hussain","Khan","Adil");

        names.sort((e1,e2)->e1.length()-e2.length());

        System.out.println("Strings sorted by length "+names);
    }
}
