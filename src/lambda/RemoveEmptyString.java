package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEmptyString {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Java", "", "Lambda", "", "Streams", ""));

        words.removeIf(sr->sr.isEmpty());
        System.out.println("After removing the empty string :"+words);

    }
}
