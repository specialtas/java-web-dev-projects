package com.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("CD Name", "CD",32000);
        DVD myDvd = new DVD("DVD Name", "DVD", 23000, "BluRay");

        myCd.spinDisc();
        myDvd.spinDisc();
        System.out.println(myCd);
        System.out.println(myDvd);

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}