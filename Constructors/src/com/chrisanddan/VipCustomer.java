package com.chrisanddan;

/**
 * Created by danross on 11/15/16.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("John Doe", 1000.00, "www.fakeemail.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 1000.00;
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
