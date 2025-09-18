package functnalInterfce;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckStartWith {

    public static void main(String[] args) {

        //Create a Predicate<String> that checks if a string starts with "A".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        Predicate<String> isStartWithA= (e)->e.startsWith("A");

        System.out.println("The given String start with A :"+isStartWithA.test(input));
    }
}
