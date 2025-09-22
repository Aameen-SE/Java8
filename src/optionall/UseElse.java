package optionall;

import java.util.Optional;

public class UseElse {
    public static void main(String[] args) {
        //Given an Optional<String>, use orElse() to provide a default value "Default".

        String str = "Aameen";
        Optional<String> opt = Optional.ofNullable(str);
        String value = opt.orElse("Default");
        System.out.println("Value from Opt1 : "+value);

        String str1 = null;
        Optional<String> opt1 = Optional.ofNullable(str1);
        String value1 = opt1.orElse("Default");
        System.out.println("Value from Opt1 : "+value1);

    }
}
