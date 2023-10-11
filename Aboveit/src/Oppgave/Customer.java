package Oppgave;

public class Customer {
    private String phoneNumber;
    private String forName;
    private String lastname;
    private Subscription subscription;
    private int dataUsage;

    public Customer(String phoneNumber, String forName, String lastname, Subscription subscription) {
        this.phoneNumber = phoneNumber;
        this.forName = forName;
        this.lastname = lastname;
        this.subscription = subscription;
        this.dataUsage = dataUsage;
    }


    public void updateDataUsage(int usedGB) {
        if (usedGB > 0) {
            this.dataUsage += usedGB;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public int getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(int dataUsage) {
        this.dataUsage = dataUsage;
    }

    @Override
    public String toString() {
        return "Kunde: " + forName + " " + lastname +
                "\nTelefonnummer: " + phoneNumber +
                "\nDataforbruk denne måneden: " + dataUsage + " GB" +
                "\nAbonnement: " + subscription.getNavn() +
                "\nAbonnement ID: " + subscription.getId();
    }
}
