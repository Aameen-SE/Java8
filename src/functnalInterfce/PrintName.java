package functnalInterfce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintName {

    public static void main(String[] args) {

        //Use a Consumer<String> to print each element of a list of names.

        List<String> names = Arrays.asList("Aameen","Kaif","Rehan","Mid");

        Consumer<String> printName = n -> System.out.println(n);

        names.forEach(printName);
    }
}
