package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a lambda expression to filter names that start with "A" from a list of strings.
public class FilterNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aameen","Rehan","Intekhab","Asif","Muddasir");

        List<String> nameStartWithA = names.stream()
                .filter(e->e.startsWith("A")).collect(Collectors.toList());

        System.out.println("Starts With A in names List :"+nameStartWithA);
    }
}
