package de.itagile.insurance;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import de.itagile.insurance.CarPolicy;

// The monthly premium is calculated from kW * 1.3
// Insurance tax = 19% of the base premium
// Total premium = Base premium + insurance tax + additional charges (optional)
// Women pay 10% of the base premium as additional charges
public class CarPolicyTest {

    private final CarPolicy golf = new CarPolicy(100);
    private final CarPolicy beetle = new CarPolicy(5);

    @Test
    public void basePremiumDependsOnPower() throws Exception {
        assertEquals(130.0, golf.calculateBasePremium());
        assertEquals(6.5, beetle.calculateBasePremium());
    }

    @Test
    public void totalPremiumDependsOnPower() throws Exception {
        assertEquals(154.7, golf.calculateTotalPremium());
        assertEquals(7.735, beetle.calculateTotalPremium());
    }

    @Test
    public void womenPayAdditionalCharges() throws Exception {
        assertEquals(167.7, golf.calculateTotalPremiumForWoman());
        assertEquals(8.385, beetle.calculateTotalPremiumForWoman());
    }
}
