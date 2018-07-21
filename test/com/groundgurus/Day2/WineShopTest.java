/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundgurus.Day2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renei
 */
public class WineShopTest {

    @Test
    public void testSomeMethod() {
        WineShop wineShop = new WineShop(false, "Juan's Wine Shop", 
                new String[] {"Wine 1", "Wine 2", "Wine 3"},
                "123ABC, 1st Street, Mandaluyong", 5);
        
        assertEquals(false, wineShop.isAreMinorsAllowed());
    }
    
}
