package ExceptionCreation.ContryChekerExceptio;

import ExceptionCreation.AgeException;

public class ContrychekerexceptionCreation {
    public static void main(String[] args) {
        ContryRegistation user=new ContryRegistation();
        try {
                user.register("pakistan");
        }catch(ContryException e){
            e.printStackTrace();
        }

    }
}
