package com.launchcode;

public class DVD extends BasicDisc {
    private String bluRay; // this is specific to DVDs
    private int spinSpeed;
    public DVD(String name, String discType, int spinSpeed, String bluRay) {
        super(name, discType, spinSpeed);
        this.bluRay = bluRay;
        this.spinSpeed= spinSpeed;
    }
    public void setBluRay(String bluRay) {
        this.bluRay = bluRay;
    }
    public int getSpinSpeed() {
        return spinSpeed;
    }
    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + spinSpeed + " rpm.");
    }
    public String getBluRay() {
        return bluRay;
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
        return "DVD Info: Name=" + getName() + ", Disc Type=" + getBluRay() + ", Spin Speed=" + spinSpeed;
    }
    // add constructors, getters, setters and dvd- specific behaviors
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
