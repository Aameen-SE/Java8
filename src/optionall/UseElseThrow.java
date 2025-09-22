package optionall;

import java.util.Optional;

public class UseElseThrow {

    public static void main(String[] args) {

        //Use orElseThrow() to throw an exception if the value is absent.

        String str = null;

        Optional<String> opt = Optional.ofNullable(str);
        String value = opt.orElseThrow(()-> new RuntimeException("No Such value is present "));
        System.out.println(value);
    }
}
