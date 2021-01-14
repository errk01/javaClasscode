package com.company.vehicle;

public class Gauges {
    private int currentRPM;
    private int speed;

    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int currentRPM) {
        this.currentRPM = currentRPM;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//    private int calculateRPM(int speed){
//        int rpm = 0;
//
//        rpm = speed * getBestGear(speed) * engineFactor();
//
//        return rpm;
//    }
//
//    private int engineFactor() {
//    }
//
//    private int getBestGear(int speed) {
//    }
}
