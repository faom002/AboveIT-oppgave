package Oppgave;

import java.util.concurrent.atomic.AtomicInteger;

public class Subscription {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);

    private int id;
    private String name;
    private double pricePerMonth;
    private int includedGB;

    public Subscription(String name, double pricePerMonth, int includedGB) {
        this.id = idGenerator.getAndIncrement();
        this.name = name;
        this.pricePerMonth = pricePerMonth;
        this.includedGB = includedGB;
    }

   

    public int getId() {
        return id;
    }

    public void setNavn(String name) {
        this.name = name;
    }

    public String getNavn() {
        return name;
    }

    public void setPrisPerMåned(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public double getPrisPerMåned() {
        return pricePerMonth;
    }

    public void setInkludertGB(int includedGB) {
        this.includedGB = includedGB;
    }

    public int getInkludertGB() {
        return includedGB;
    }

    @Override
    public String toString() {
        return "Abonnement ID: " + id +
                "\nNavn: " + name +
                "\nPris per måned: " + pricePerMonth +
                "\nInkludert GB: " + includedGB;
    }
}
