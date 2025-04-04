package ExceptionCreation.UserRegistationSystem;

public class RegistationSystem {
    public static void main(String[] args) {


        try {
            UserRegistetion user = new UserRegistetion("tejaspatil", "Pass@123");
        } catch (ValidationException ex){
          ex.printStackTrace();
        }
}
}
