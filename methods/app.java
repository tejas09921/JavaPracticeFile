package methods;

public class app {
    public String str_1="I am a public member";

    void printFrontClass(){
        System.out.println("within a class"+str_1);
    }
    public static void main(String[] args) {
        app obj=new app();
        obj.printFrontClass();
        System.out.println("within a class"+obj.str_1);

    }
}
