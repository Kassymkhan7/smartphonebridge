package com.Kassymkhan7.smartphonebridge;

public class Main {
    public static void main(String[] args) {
        Smartphone flagshipAndroid = new FlagshipSmartphone(new Android());
        Smartphone flagshipIos = new FlagshipSmartphone(new iOS());
        Smartphone budgetAndroid = new BudgetSmartphone(new Android());

        System.out.println(flagshipAndroid.start());
        System.out.println(flagshipIos.start());
        System.out.println(budgetAndroid.start());
    }
}