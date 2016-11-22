package com.chrisanddan;

/**
 * Created by danross on 11/20/16.
 */
public class Pc {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public Pc(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
