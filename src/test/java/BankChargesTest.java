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
public class BankChargesTest {
    
    public BankChargesTest() {
    }
    @Test
    public void testCalculateChargeZero() {
        System.out.println("calculateCharge");
        int numOfChecks = 0;
        double expResult = 10.0;
        double result = BankCharges.calculateCharge(numOfChecks);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateChargeTen() {
        System.out.println("calculateCharge");
        int numOfChecks = 10;
        double expResult = 11.0;
        double result = BankCharges.calculateCharge(numOfChecks);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateChargeThirty() {
        System.out.println("calculateCharge");
        int numOfChecks = 30;
        double expResult = 12.4;
        double result = BankCharges.calculateCharge(numOfChecks);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateChargeFifty() {
        System.out.println("calculateCharge");
        int numOfChecks = 50;
        double expResult = 13.0;
        double result = BankCharges.calculateCharge(numOfChecks);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateChargeSeventy() {
        System.out.println("calculateCharge");
        int numOfChecks = 70;
        double expResult = 12.8;
        double result = BankCharges.calculateCharge(numOfChecks);
        assertEquals(expResult, result);
    }
}
