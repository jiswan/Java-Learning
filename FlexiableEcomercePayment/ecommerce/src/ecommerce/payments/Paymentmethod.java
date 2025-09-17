package ecommerce.payments;

public interface Paymentmethod {
    

    boolean validationDetail();
    void processPayment(double amount);
    

}
