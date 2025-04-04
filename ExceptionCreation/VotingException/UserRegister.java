package ExceptionCreation.VotingException;

public class UserRegister {
    public void register(int age) throws AgeException {
        if (age<=18){
            throw new AgeException();
        }else {
            System.out.println("Succesesfully Register");
        }
    }
}
