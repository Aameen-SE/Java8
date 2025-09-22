package optionall;

import java.util.Optional;

public class CheckValue {
    public static void main(String[] args) {
        //Create an empty Optional and check if it has a value.

        Optional<String> names = Optional.empty();
        if(names.isPresent())
            System.out.println("If present is :"+names.get());
        else
            System.out.println("No value present in it !");
    }
}
