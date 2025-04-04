package MultiThreading;

public class MyMainClass1 {
    public static void main(String[] args) {
        Mythread mythread0=new Mythread();
        mythread0.start();

        System.out.println(Thread.currentThread().getName()+"    "+Thread.currentThread().isDaemon());
        System.out.println("thread0 is :"+mythread0.isDaemon());
        Thread.yield();

        Mythreade2 thread1=new Mythreade2();
        thread1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main threads !!!!");
        }

    }
}
