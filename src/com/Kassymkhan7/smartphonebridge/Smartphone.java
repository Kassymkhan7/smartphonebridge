package com.Kassymkhan7.smartphonebridge;

// Abstraction: holds a reference to an OperatingSystem implementor.
// A Smartphone never knows HOW the OS boots, only THAT it can.
public abstract class Smartphone {

    protected final OperatingSystem os;

    protected Smartphone(OperatingSystem os) {
        this.os = os;
    }

    public abstract String getModelInfo();

    public String start() {
        return getModelInfo() + " -> " + os.boot();
    }
}