package ExceptionCreation.UserRegistationSystem;

public class UserRegistetion {
    private String userName;
    private String passWord;


    public UserRegistetion(String userName, String passWord) throws ValidationException {
        if (userName !=null  || userName.isEmpty()) throw new ValidationException("User cannot be empty ! ");

        
        this.userName = userName;
        this.passWord = passWord;
    }

}
