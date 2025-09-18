package functnalInterfce;

import java.util.function.Supplier;

public class RandomSupplier {

    public static void main(String[] args) {

        //Write a Supplier<Double> that always returns a random number between 0 and 1.

        Supplier<Double> randomSupp= () -> Math.random();
        System.out.println("Random Number is :"+randomSupp.get());
    }
}
