package Oppgave;

import Oppgave.Customer;

import java.util.ArrayList;
import java.util.List;

public class MobileOperator {
    private List<Subscription> subscriptions;
    private List<Customer> customers;

    public MobileOperator() {
        subscriptions = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void registerSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public List<Subscription> getAllSubscription() {
        return subscriptions;
    }

    public void deletesubscription(Subscription subscription) {
        subscriptions.remove(subscription);

        customers.removeIf(customer -> customer.getSubscription() == subscription);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomer() {
        return customers;
    }

    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Subscription getCustomerPhoneNumber(String phoneNumber) {
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer.getSubscription();
            }
        }
        return null;
    }


    public List getCustomerWithSubscriptionId(int abonnementId) {
        List<Customer> customerWithSubscription = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getSubscription().getId() == abonnementId) {
                customerWithSubscription.add(customer);
            }
        }
        return customerWithSubscription;
    }
}
