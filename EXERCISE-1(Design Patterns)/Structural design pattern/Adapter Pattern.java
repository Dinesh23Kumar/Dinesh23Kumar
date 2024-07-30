// Existing Payment Processor Interface
interface PaymentProcessor {
    void processPayment(String account, double amount);
}

// Existing Payment Processor Implementation
class OldPaymentProcessor implements PaymentProcessor {
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment of " + amount + " for account " + account);
    }
}

// New Payment Gateway Interface
interface NewPaymentGateway {
    void makePayment(String customerId, double amount);
}

// New Payment Gateway Implementation
class NewPaymentGatewayImpl implements NewPaymentGateway {
    public void makePayment(String customerId, double amount) {
        System.out.println("Making payment of " + amount + " for customer " + customerId);
    }
}

// Adapter
class PaymentAdapter implements PaymentProcessor {
    private NewPaymentGateway newPaymentGateway;

    public PaymentAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    public void processPayment(String account, double amount) {
        newPaymentGateway.makePayment(account, amount);
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor oldProcessor = new OldPaymentProcessor();
        oldProcessor.processPayment("12345", 100.0);

        PaymentProcessor adapter = new PaymentAdapter(new NewPaymentGatewayImpl());
        adapter.processPayment("12345", 100.0);
    }
}
