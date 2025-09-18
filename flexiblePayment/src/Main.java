import ecomerce.checkout.Checkout;
import ecomerce.paymentmethods.CreditCardMethod;
import ecomerce.paymentmethods.Paymentmethod;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            double amount =99.99;
        Checkout checkput = new Checkout();
        Paymentmethod credit = new CreditCardMethod("1234567890123456","123");
        checkput.finalCheckout(credit,amount);

        }
    }
