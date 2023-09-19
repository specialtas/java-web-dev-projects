package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
//        Comparator comparator = new FlavorComparator();
//
//        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());
//        Comparator comparator = new FlavorComparator();
//
//        flavors.sort(comparator);
        cones.sort(new ConeComparator());

        toppings.sort(new ToppingComparator());


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        printSeparator();
            for (Cone cone : cones) {
                String costString = String.format("%.2f", cone.getCost());
                System.out.println(cone.getName() + ": $" + costString);
        }
        printSeparator();
        for (Topping topping : toppings) {
            System.out.println(topping); // This will call the toString method from Topping class
        }
    }
    private static void printSeparator() {
        System.out.println("--------------------** \uD83C\uDF66 **--------------------");
    }
}