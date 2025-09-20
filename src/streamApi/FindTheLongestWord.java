package streamApi;

import java.util.Arrays;
import java.util.List;

public class FindTheLongestWord {

    public static void main(String[] args) {

        //From a list of words, use streams to find the longest word.
        List<String> names = Arrays.asList("aameen","mannawwar","rehan","asif");

        String longest = names.stream().reduce((word1,word2)->word1.length() >= word2.length()?word1:word2).orElse("");

        System.out.println("The longest in the list is :"+longest);
    }
}
