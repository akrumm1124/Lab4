/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testCalculateChargeZero() {
        System.out.println("calculateCharge");
        int numOfChecks = 0;
        Main.calculateCharge(numOfChecks);
    }
    @Test
    public void testCalculateChargeTen() {
        System.out.println("calculateCharge");
        int numOfChecks = 10;
        Main.calculateCharge(numOfChecks);
    }
    @Test
    public void testCalculateChargeThirty() {
        System.out.println("calculateCharge");
        int numOfChecks = 30;
        Main.calculateCharge(numOfChecks);
    }
    @Test
    public void testCalculateChargeFifty() {
        System.out.println("calculateCharge");
        int numOfChecks = 50;
        Main.calculateCharge(numOfChecks);
    }
    @Test
    public void testCalculateChargeSeventy() {
        System.out.println("calculateCharge");
        int numOfChecks = 70;
        Main.calculateCharge(numOfChecks);
    }
}
