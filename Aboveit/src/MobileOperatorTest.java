import Oppgave.Customer;
import Oppgave.MobileOperator;
import Oppgave.Subscription;
import org.junit.Test;
import static org.junit.Assert.*;

public class MobileOperatorTest {

    @Test
    public void testRegisterSubscription() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription = new Subscription("Subscription A", 29.99, 10);

        mobileOperator.registerSubscription(subscription);
        assertEquals(1, mobileOperator.getAllSubscription().size());
        assertEquals(subscription, mobileOperator.getAllSubscription().get(0));
    }

    @Test
    public void testDeleteSubscription() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription = new Subscription("Subscription A", 29.99, 10);

        mobileOperator.registerSubscription(subscription);
        mobileOperator.deletesubscription(subscription);
        assertEquals(0, mobileOperator.getAllSubscription().size());
    }

    @Test
    public void testRegisterCustomer() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription = new Subscription("Subscription A", 29.99, 10);
        Customer customer = new Customer("1234567890", "John", "Doe", subscription);

        mobileOperator.registerSubscription(subscription);
        mobileOperator.registerCustomer(customer);
        assertEquals(1, mobileOperator.getAllCustomer().size());
        assertEquals(customer, mobileOperator.getAllCustomer().get(0));
    }

    @Test
    public void testDeleteCustomer() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription = new Subscription("Subscription A", 29.99, 10);
        Customer customer = new Customer("1234567890", "John", "Doe", subscription);

        mobileOperator.registerSubscription(subscription);
        mobileOperator.registerCustomer(customer);
        mobileOperator.deleteCustomer(customer);
        assertEquals(0, mobileOperator.getAllCustomer().size());
    }

    @Test
    public void testGetSubscriptionByPhoneNumber() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription = new Subscription("Subscription A", 29.99, 10);
        Customer customer = new Customer("1234567890", "John", "Doe", subscription);

        mobileOperator.registerSubscription(subscription);
        mobileOperator.registerCustomer(customer);
        Subscription foundSubscription = mobileOperator.getCustomerPhoneNumber("1234567890");
        assertEquals(subscription, foundSubscription);
    }

    @Test
    public void testGetCustomersWithSubscriptionId() {
        MobileOperator mobileOperator = new MobileOperator();
        Subscription subscription1 = new Subscription("Subscription A", 29.99, 10);
        Subscription subscription2 = new Subscription("Subscription B", 39.99, 20);
        Customer customer1 = new Customer("1234567890", "John", "Doe", subscription1);
        Customer customer2 = new Customer("9876543210", "Jane", "Smith", subscription2);

        mobileOperator.registerSubscription(subscription1);
        mobileOperator.registerSubscription(subscription2);
        mobileOperator.registerCustomer(customer1);
        mobileOperator.registerCustomer(customer2);

        assertEquals(1, mobileOperator.getCustomerWithSubscriptionId(1).size());
        assertEquals(1, mobileOperator.getCustomerWithSubscriptionId(2).size());
    }
}