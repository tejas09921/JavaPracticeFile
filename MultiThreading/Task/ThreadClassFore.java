package MultiThreading.Task;

public class ThreadClassFore implements Runnable{
    @Override
    public void run() {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.println("the num is odd"+i);
            }else System.out.println("The num is even: "+i);
        }

    }
}
