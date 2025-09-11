package lambda;

import java.util.Arrays;
import java.util.List;

//Use a lambda expression to sort a list of Employee objects by name in alphabetical order.
public class SortNameAlphabetical {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList("Aameen","Rahul","Rehan","Kaif","Muddasir","Adil");

employees.sort((e1,e2)->e1.compareTo(e2));

        System.out.println(employees);
    }
}
