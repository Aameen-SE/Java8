package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen","Hussain","Khan");

        String result = names.stream().collect(Collectors.joining(","));
        System.out.println("After joining :"+result);
    }
}
