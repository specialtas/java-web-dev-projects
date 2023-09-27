package com.launchcode;

public abstract class BasicDisc implements OpticalDisc {
    private String name;
    private String discType;
    private int spinSpeed;

    public BasicDisc(String name, String discType, int discSpeed) {
        this.name = name;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
    }

    public String getName() {
        return name;
    }

    public String getDiscType() {
        return discType;
    }

    public int getDiscSpeed() {
        return spinSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setDiscSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
    // need constructors, getters, setters and stared behaviors
}
