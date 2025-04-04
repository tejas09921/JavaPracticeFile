package ExceptionCreation;

public class one {
    public static void main(String[] args) {
        // create an exception
        UserRegistetion user=new  UserRegistetion();
        try {
            user.register(10);
        }catch (AgeException e){
            e.printStackTrace();
        }
        //after runnig the program they can be shown an exceptuon becuse user age enter is less then 18
    }
}
