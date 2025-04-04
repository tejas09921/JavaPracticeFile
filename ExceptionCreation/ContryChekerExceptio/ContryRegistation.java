package ExceptionCreation.ContryChekerExceptio;

import ExceptionCreation.AgeException;

public class ContryRegistation {
    public void register(String ContryName) throws ContryException {
        if (ContryName.equals("india")){
            throw new ContryException("User is indian!");
        }else {
            System.out.println("you cannnot be register");
        }
    }

}
