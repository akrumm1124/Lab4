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
public class InsuranceTest {
    
    public InsuranceTest() {
    }



    @Test
    public void testCalculateInsurance() {
        System.out.println("calculateInsurance");
        int age = 35;
        Insurance.calculateInsurance(age);
    }
    
}
