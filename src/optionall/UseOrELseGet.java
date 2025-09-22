package optionall;

import java.util.Optional;

public class UseOrELseGet {

    public static void main(String[] args) {

        //Use orElseGet() to provide a default value using a Supplier.

        String str = "Aameen";
        Optional<String> ot1 = Optional.ofNullable(str);
        String value1 = ot1.orElseGet(()->"Default from Supplier");
        System.out.println(value1);

        String str1 = null;
        Optional<String> ot2 = Optional.ofNullable(str1);
        String value2 = ot2.orElseGet(()->"Default from Supplier");
        System.out.println(value2);
    }
}
