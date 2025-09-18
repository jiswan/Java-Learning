package ecomerce.paymentmethods;

public interface Paymentmethod {
    void paymentMethod(double amount);
    boolean validateDetails();
}
