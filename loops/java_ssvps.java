package loops;

public class java_ssvps {

    public class Loop1 {
        int i;
        int num[]= {1,2,3,4,5};
        void for1() {
            for(i=0;i<num.length;i++) {
                System.out.print(num[i]+" ");
            }
            for(int x:num) {
                System.out.print(x+" ");
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
         //   Loop1 l1= new Loop1();
            //l1.for1();

        }

    }
}
