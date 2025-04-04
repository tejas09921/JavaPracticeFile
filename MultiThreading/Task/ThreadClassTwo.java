package MultiThreading.Task;

public class ThreadClassTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("The table of num "+i+ "is");
        }

    }
}
