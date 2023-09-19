package org.launchcode;

import java.util.ArrayList;

public class Topping extends Ingredient {
    private ArrayList<String> benefits;

    public Topping(String aName, double aCost, ArrayList<String> someBenefits) {
        super(aName, aCost, someBenefits);
        this.benefits = someBenefits; // Initializing benefits with someBenefits
    }

    public String getBenefits() {
        // this joins the elements of the benefits ArrayList into a single String
        return String.join(", ", benefits);
    }

    @Override
    public String toString() {
        return getName() + " : Health Benefit: " + getBenefits() + " : $" + String.format("%.2f", getCost());
    }
}
    

