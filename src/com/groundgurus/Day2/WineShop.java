package com.groundgurus.Day2;

/**
 *
 * @author Renei
 */
public class WineShop extends Shop {
    private boolean areMinorsAllowed;

    public WineShop(boolean areMinorsAllowed, String name, String[] items, String address, int numberOfEmployees) {
        super(name, items, address, numberOfEmployees);
        this.areMinorsAllowed = areMinorsAllowed;
    }    

    WineShop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isAreMinorsAllowed() {
        return areMinorsAllowed;
    }

    public void setAreMinorsAllowed(boolean areMinorsAllowed) {
        this.areMinorsAllowed = areMinorsAllowed;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Are Minors Allowed: " + areMinorsAllowed);
    }
    
    
}
