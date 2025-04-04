package MultiThreading.Task;

public class ThreadClassThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Factorial of "+i+" is :"+i*i);
        }
    }
}
