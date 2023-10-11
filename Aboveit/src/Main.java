import Oppgave.Customer;
import Oppgave.MobileOperator;
import Oppgave.Subscription;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MobileOperator mobileOperator = new MobileOperator();

        Subscription subscription = new Subscription("Oppgave.Subscription plan A", 33.99, 10);
        Subscription subscription1 = new Subscription("Oppgave.Subscription plan B", 40.99, 20);

        Customer customer1 = new Customer("2223333333", "nikolay", "Doe", subscription);
        Customer customer2 = new Customer("9232323232", "Jule nissen", "rein", subscription1);

        mobileOperator.registerSubscription(subscription);
        mobileOperator.registerSubscription(subscription1);
        mobileOperator.registerCustomer(customer1);
        mobileOperator.registerCustomer(customer2);


        System.out.println("All Oppgave.Subscription before deletion");
        System.out.println("All subscription: " + mobileOperator.getAllSubscription());
        System.out.println("Alle customer: " + mobileOperator.getAllCustomer());

        mobileOperator.deleteCustomer(customer1);

        System.out.println();


        System.out.println("Alle subscription after deletion: " + mobileOperator.getAllSubscription());
        System.out.println("Alle customer after deletion: " + mobileOperator.getAllCustomer());


        System.out.println();

        System.out.println("phone number search");

        String searchPhoneNumber = "9232323232";
        Subscription foundSubscription = mobileOperator.getCustomerPhoneNumber(searchPhoneNumber);

        if (foundSubscription != null) {
            System.out.println("subscription to phonenumber " + searchPhoneNumber + " er: " + foundSubscription.getNavn());
        } else {
            System.out.println("no susbription phone on this number " + searchPhoneNumber);
        }

        System.out.println();

        System.out.println("searching with subscription id");

        int searchingWithId = 2;
        List<Customer> customerWithSubscription = mobileOperator.getCustomerWithSubscriptionId(searchingWithId);

        System.out.println("customer with subscription ID " + searchingWithId + ":");
        for (Customer customer : customerWithSubscription) {
            System.out.println(customer.getForName() + " " + customer.getLastname());
        }


    }
}
