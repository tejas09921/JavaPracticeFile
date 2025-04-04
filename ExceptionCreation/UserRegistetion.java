package ExceptionCreation;

public class UserRegistetion {
  public void register(int age) throws AgeException {
        if (age<=18){
            throw new AgeException("User is an Miner");
        }else {
            System.out.println("Succesfully register");
        }
    }
}
