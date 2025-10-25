package lambda.oct22;
//Sort Strings by Length

import java.util.Arrays;
import java.util.List;

public class SortStringsbyLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape");

      words.sort((e1,e2)->e1.length()-e2.length());
      words.forEach(System.out::println);

    }
}
