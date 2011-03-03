package de.itagile.insurance;

public class CarPolicy {

    private static final double ADDITIONAL_PERCENTAGE_WOMEN = 0.10;

    private static final double TAX_PERCENTAGE = 0.19;

    private final int powerInKw;

    public CarPolicy(int powerInKw) {
        this.powerInKw = powerInKw;
    }

    public double calculateBasePremium() {
        return (powerInKw * 1.3);
    }

    public double calculateTotalPremium() {
        double tax = calculateBasePremium() * TAX_PERCENTAGE;
        return calculateBasePremium() + tax;
    }

    public double calculateTotalPremiumForWoman() {
        double additional_charges = calculateBasePremium() * ADDITIONAL_PERCENTAGE_WOMEN;
        return calculateTotalPremium() + additional_charges;
    }
}
