package streamApi;

import java.util.Arrays;
import java.util.List;

public class CountStartWithA {
    public static void main(String[] args) {

        //From a list of strings, use streams to count how many start with "A"

        List<String> names = Arrays.asList("Aameen","Adil","Rehan","Kamran","Asif");

        long count = names.stream().filter(e->e.startsWith("A")).count();
        System.out.println("Number of string start with A :"+count);
    }
}
