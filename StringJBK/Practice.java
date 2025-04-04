package StringJBK;

public class Practice {
    public static void main(String[] args) {
        String s1=new String("wel     come ");
        String s2=new String("welcome");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String b1="bajrand re aaba";
//        System.out.println(s1.concat(b1));
//        System.out.println(s1.codePointAt(2));
//        System.out.println(s1.hashCode());
//        System.out.println(s1.strip());
//        System.out.println(s1.replaceAll("e","o"));
        System.out.println(s2.translateEscapes());

    }
}
