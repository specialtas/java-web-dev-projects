package com.launchcode;

public class CD extends BasicDisc {
    private int spinSpeed;
    // TODO: Implement your custom interface.

    public CD(String name, String discType, int spinSpeed) {
        super(name, discType, spinSpeed);
        this.spinSpeed= spinSpeed;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinSpeed + " rpm.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void reportInfo() {

    }

    @Override
    public String toString() {
        return "CD Info: Name=" + getName() + ", Disc Type=" + getDiscType() + ", Spin Speed=" + spinSpeed;
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
