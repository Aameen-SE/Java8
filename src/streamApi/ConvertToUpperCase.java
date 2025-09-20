package streamApi;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        //Convert a list of strings to uppercase using map() and collect them into a new list.

        List<String> names = Arrays.asList("aameen","mannawwar","rehan","asif");

        List<String> upperCaseNames = names.stream().map(str->str.toUpperCase()).toList();

        System.out.println(upperCaseNames);
    }
}
