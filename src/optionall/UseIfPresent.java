package optionall;

import java.util.Optional;

public class UseIfPresent {
    public static void main(String[] args) {

        //Use ifPresent() to print the value if available

        Optional<String> opt = Optional.of("Aameen");
        opt.ifPresent((e)-> System.out.println(e));
    }
}
