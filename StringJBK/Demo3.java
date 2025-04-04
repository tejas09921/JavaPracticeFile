package StringJBK;

public class Demo3 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";

        boolean ans=s1.equals(s2);
        System.out.println(ans);

        String s3="Hello";
        boolean ans2=s1.equals(s3);
        System.out.println(ans2);

        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
