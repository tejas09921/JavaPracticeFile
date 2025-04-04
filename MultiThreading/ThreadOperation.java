class ThreadOperation{
    public static void main(String[] args) {
        System.out.println("Program started...");
        int x=56+34;
        System.out.println("Sum is:"+x);

        Thread t=Thread.currentThread();
        String tname=t.getName();
        System.out.println("Current runniing trad is:"+tname);

        System.out.println("Program Ended...");
    }
}