package MultiThreading;

class MyanotherThread extends mythreads{
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("valur of i is:" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("after deleying oe second");
            }
        }
    }
}
