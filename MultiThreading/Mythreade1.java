package MultiThreading;

public class Mythreade1 extends Demo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"Says  :Good Morning !!!!");
        }
    }
}
