package ABStractionzpro;

public class MyMainClass2 {
    private int gof;

    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.makePayment(3000);
        Payment payment2 = new UPIPayment2();
        payment2.makePayment(6000);

    }
}

