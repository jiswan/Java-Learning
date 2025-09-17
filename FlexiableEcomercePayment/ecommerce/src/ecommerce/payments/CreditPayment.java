package ecommerce.payments;
public class CreditPayment implements Paymentmethod{
    private  String cardNumber;
    private  String cvv;

    public CreditPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing credit card payment of $" + amount);
    }
    @Override
    public boolean validationDetail()
    {
        return cardNumber!=null && cardNumber.length()== 16 && cvv!=null && cvv.length() ==3;
    }

}
