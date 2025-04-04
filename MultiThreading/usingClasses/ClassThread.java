package MultiThreading.usingClasses;

public class ClassThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow "+Thread.currentThread().getName());
        }
    }
}
