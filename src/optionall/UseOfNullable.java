package optionall;

import java.util.Optional;

public class UseOfNullable {
    public static void main(String[] args) {
        //Use ofNullable() with a null string and print "Value is null" if empty.

        String str = null;
        Optional<String> opt = Optional.ofNullable(str);

        if(opt.isPresent())
            System.out.println("Value is present :"+opt.get());
        else
            System.out.println("Value is null");
    }
}
