package TwoDimentionArray.JBK;

public class StoreVavels {
    public static void main(String[] args) {
        char ch[]={'a','u','t','i','j','e'};
        char chNew[]=new char[ch.length];
        int index=0;
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')){
                chNew[index++]=ch[i];
            }
        }
        System.out.println(index);
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i]=='a')&&(ch[i]=='e')&&(ch[i]=='i')&&(ch[i]=='o')&&(ch[i]=='u')){
                chNew[index++]=ch[i];
            }
        }
        for (int i = 0; i < chNew.length; i++) {
            System.out.println(i+"  "+chNew[i]);
        }
    }
}
