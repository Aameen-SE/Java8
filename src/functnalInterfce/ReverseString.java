package functnalInterfce;

import java.util.function.Consumer;

public class ReverseString {

    public static void main(String[] args) {

        //Use a Consumer<String> to print the reverse of a string.

        String str = "Aameen";

        Consumer<String> revrseString = e-> { String rev = new StringBuilder(e).reverse().toString();
            System.out.println(rev);

        };
                revrseString.accept(str);
    }
}
