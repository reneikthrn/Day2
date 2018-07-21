package com.groundgurus.Day2;

/**
 *
 * @author Renei
 */
public class ShopMain {
    public static void main(String[] args) {
//        Shop wineShop = new Shop();
//        wineShop.name = "Juan's Wine Shop"; //Passed a value under the attribute name
//        wineShop.items = new String[] {"Wine 1", "Wine 2", "Wine 3"};
//        wineShop.address = "123ABC, 1st Street, Mandaluyong";
//        wineShop.printDetails();
////        System.out.println("Name: " + wineShop.name);
//////        Prints all the items from the Wine shop
////        for (String item : wineShop.items) {
////            System.out.println(item);
////        }

//      Other Way:
        Shop wineShop = new WineShop(false, "Juan's Wine Shop", 
                new String[] {"Wine 1", "Wine 2", "Wine 3"},
                "123ABC, 1st Street, Mandaluyong", 5);
        wineShop.printDetails();

        
        
        Shop cakeShop = new Shop();
        cakeShop.setName("Maria's Cake Shop");
        cakeShop.setItems(new String[] {"Cake 1", "Cake 2", "Cake 3"});
        cakeShop.setAddress("789XYZ, 2nd Street, Makati City");
        cakeShop.setNumberOfEmployees(-10);
        cakeShop.printDetails();
//        System.out.println("Name: " + cakeShop.name);
////        Prints all the Items from the CakeShop
//        for (String item : cakeShop.items) {
//            System.out.println(item);
//        }
        
    }

}
