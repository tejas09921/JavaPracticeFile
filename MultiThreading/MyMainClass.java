package MultiThreading;

public class MyMainClass {
    public static void main(String[] args) {
        Mythreade1 t1=new Mythreade1();
        Mythreade1 t2=new Mythreade1();
        Thread p=new Thread(t1);
        Thread q=new Thread(t2);
        p.setName("Thread P");
        q.setName("Thread Q");
        p.start();
        q.start();
    }
}
