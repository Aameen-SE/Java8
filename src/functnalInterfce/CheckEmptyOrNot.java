package functnalInterfce;

import java.util.function.Predicate;

public class CheckEmptyOrNot {

    public static void main(String[] args) {
        //Use a Predicate<String> to check if a string is empty.
        String str = "";

        Predicate<String> checkEmpty = st-> st.isEmpty();

        System.out.println("Is the given string is empty :"+checkEmpty.test(str));
    }
}
