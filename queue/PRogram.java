package queue;

public class PRogram {
    public static class queueA(int A){
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val){
            if(f==-1) f=r=0;
            else {
                arr[++r]=val;
            }
        }
    }
    public static void main(String[] args) {

    }
}
