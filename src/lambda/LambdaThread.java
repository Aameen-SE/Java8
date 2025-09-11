package lambda;
//Create a thread using Runnable with a lambda expression that prints "Hello from thread"
public class LambdaThread {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello from Task Thread");

        Thread thread = new Thread(task);
        thread.start();
    }
}
