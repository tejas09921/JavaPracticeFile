package ExceptionCreation.VotingException;

public class Main {
    public static void main(String[] args) throws AgeException {
        UserRegister user=new UserRegister();
        user.register(19);
    }
}
