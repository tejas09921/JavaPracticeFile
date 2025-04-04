package MultiThreading;

public class mythreads implements Runnable{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("valur of i is:"+ i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("after deleying oe second");
            }
        }
    }
    public static void main(String[] args) {
        mythreads t1=new mythreads();
        Thread thr=new Thread(t1);
        thr.start();
        MyanotherThread t2=new MyanotherThread();
        Thread thr2=new Thread(t2);
        thr2.start();
    }
}
