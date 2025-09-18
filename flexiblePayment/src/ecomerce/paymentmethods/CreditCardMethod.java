package ecomerce.paymentmethods;

public class CreditCardMethod implements Paymentmethod{
    private String creditCardNumber;
    private String cvv;

    public CreditCardMethod(String creditCardNumber, String cvv) {
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
    }

    @Override
    public void paymentMethod(double amount) {
        System.out.println("Processing credit card payment of $" + amount);

    }

    @Override
    public boolean validateDetails() {

        return creditCardNumber != null && creditCardNumber.length() == 16 && cvv != null && cvv.length() == 3;
    }
}
