package StringJBK;

public class Demo2 {
    public static void main(String[] args) {
        String s1="Welcome To Java";
        System.out.println(s1.indexOf('T'));

        char[] ch=s1.toCharArray();
        for (char c:ch){
            System.out.println(c);
        }
        s1=s1.toUpperCase();
        System.out.println(s1);
        s1=s1.toLowerCase();
        System.out.println(s1);
    }
}
