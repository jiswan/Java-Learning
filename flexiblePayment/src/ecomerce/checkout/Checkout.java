package ecomerce.checkout;

import ecomerce.paymentmethods.Paymentmethod;

public class Checkout {

    public void finalCheckout(Paymentmethod credit, double amount) {
        if(credit.validateDetails())
        {
             credit.paymentMethod(amount);
        }
    }
}
