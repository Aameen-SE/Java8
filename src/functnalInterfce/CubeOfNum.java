package functnalInterfce;

import java.util.Scanner;
import java.util.function.Consumer;

public class CubeOfNum {

    public static void main(String[] args) {

        //Write a Consumer<Integer> that prints the cube of a given number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        Consumer<Integer> cubeNum = (n)-> System.out.println("Cube of the given number is : "+n*n*n);

        cubeNum.accept(num);
    }
}
