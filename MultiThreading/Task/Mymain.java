package MultiThreading.Task;

import MultiThreading.Mythreade1;

public class Mymain {
    public static void main(String[] args) {
        ThreadClassOne c1=new ThreadClassOne();
        Thread p=new Thread(c1);
        ThreadClassTwo c2=new ThreadClassTwo();
        Thread q=new Thread(c2);
        ThreadClassThree c3=new ThreadClassThree();
        Thread r=new Thread(c3);
        ThreadClassFore c4=new ThreadClassFore();
        Thread s=new Thread(c4);
        p.start();
        q.start();
        r.start();
        s.start();
    }


}
