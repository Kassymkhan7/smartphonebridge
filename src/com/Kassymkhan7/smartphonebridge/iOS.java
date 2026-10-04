package com.Kassymkhan7.smartphonebridge;

public class iOS implements OperatingSystem {
    @Override
    public String boot() {
        return "Booting iOS — Apple services loading...";
    }
}