package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageOfListOfNum {
    public static void main(String[] args) {

        //Find the average of a list of integers using streams.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(0,Integer::sum)/(double)numbers.size();

        System.out.println("Average of the given num is :"+avg);
        /*OptionalDouble avg = numbers.stream().mapToInt(Integer::intValue).average();

        if(avg.isPresent())
            System.out.println("Average of the list of number is : "+avg.getAsDouble());
        else
            System.out.println("No average of the list of number ");
        */
    }
}
