package StringJBK;

public class demo4 {
    public static void main(String[] args) {
        String s1="welcome";
        String s2="WELCOME";
        System.out.println(s1==s2);

        String s3="welcome";
        System.out.println(s1==s3);


        String s4=new String("welcome");
        System.out.println(s1==s4);

        String s5=new String("welcome");
        System.out.println(s4==s5);
        //anoter pro
        String a1="abc";
        String a2="aba";
        System.out.println(a1.compareTo(s2));
    }
}
