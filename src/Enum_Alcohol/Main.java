package Enum_Alcohol;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        
        // Direct access on a enumeration element.
        System.out.println("Alcohol concentration of bananas: " + Alcohol.BANANA.alcoholConcentration() + " %");
        
        // Calculation of the enumeration elements with the same function but different results.
        System.out.println(Alcohol.BEER.getDepletionTime(0.5, 80)); // 0.5 liters and 80 kilograms body weight
        System.out.println(Alcohol.WINE.getDepletionTime(0.2, 70)); // 0.2 liters and 70 kilograms body weight
        
    }

}

enum Alcohol {

    // Members of the enumeration.
    WINE(12), BEER(4.5), BANANA(1), WATER(0);

    private final double alcoholConcentrationPercentage;

    // Constructor
    private Alcohol(double inputAlcoholConcentrationPercentage) {
        this.alcoholConcentrationPercentage = inputAlcoholConcentrationPercentage;
    }

    public double alcoholConcentration() {
        return this.alcoholConcentrationPercentage;
    }

    // One function for calculation of all enumeration elements.
    // This is a example for training purposes. I don't really know what the exact calculation is.
    public String getDepletionTime(double litersAreDrunk, double kilogramsOfPerson) {

        double summaryOfAlcohol = litersAreDrunk * (this.alcoholConcentrationPercentage / 100.0d);

        double depletionTime = 9000.0d * (summaryOfAlcohol / kilogramsOfPerson);

        return "Alcohol remains in blood for " + (new DecimalFormat("0.0")).format(depletionTime) + " hours with "
                + litersAreDrunk + " liters " + this.toString() + " on " + kilogramsOfPerson + " kg body weight.";
    
    }

}