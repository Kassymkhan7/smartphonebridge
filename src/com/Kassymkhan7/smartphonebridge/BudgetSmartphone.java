package com.Kassymkhan7.smartphonebridge;

public class BudgetSmartphone extends Smartphone {
    public BudgetSmartphone(OperatingSystem os) {
        super(os);
    }

    @Override
    public String getModelInfo() {
        return "Galaxy A50 (Budget)";
    }
}