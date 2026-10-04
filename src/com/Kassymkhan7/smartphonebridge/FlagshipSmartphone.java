package com.Kassymkhan7.smartphonebridge;

public class FlagshipSmartphone extends Smartphone {
    public FlagshipSmartphone(OperatingSystem os) {
        super(os);
    }

    @Override
    public String getModelInfo() {
        return "Galaxy S20 Ultra 5G (Flagship)";
    }
}