package com.groundgurus.Day2;

/**
 *
 * @author Renei
 */
public class Shop {
    //Attributes - Default Values
    private String name; // Shop Name
    private String[] items; //How many items
    private String address;
    private int numberOfEmployees;

    public Shop() {
    } // Doesnt receive any arguments

    public Shop(String name, String[] items, String address, int numberOfEmployees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    

    
    //Reference - Null 
    //Primitive - int = 0, .. etc.
    
    public String findByItemName (String name) {
        //Statement to find item here
        return "";
    }
    
    
    
//    Print Details
    public void printDetails () {
        System.out.println("Name: " + name);
//        Prints all the items from the Wine shop
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Address: " + address);
        System.out.println("Number of Employees: " + numberOfEmployees);
        
        if(numberOfEmployees > 0) {
        } else {
            System.err.println("Invalid number of Employees!");
        }
    }
//  VOID bc we dont return anything 
    
}
