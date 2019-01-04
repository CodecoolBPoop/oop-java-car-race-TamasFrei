package com.codecool.car_race;

public class Truck extends Vehicle {

    private int speed = 0;
    private boolean isBreakdown = false;
    private byte breakdownTurnsLeft = 0;

    protected Truck() {
        super(Type.TRUCK);
        setName(Integer.toString((int)(Math.random() * 999 + 1)));
    }

    @Override
    protected void prepareForLap(Race race) {
        if (breakdownTurnsLeft != 0)  {
            breakdownTurnsLeft--;
        } else {
            int chance = (int)(Math.random() * 99 + 1);
            if (chance > 5) {
                this.isBreakdown = false;
                this.speed = 100;
            } else {
                this.isBreakdown = true;
                this.breakdownTurnsLeft = 2;
                this.speed = 0;
            }
        }
    }

    @Override
    void moveForAnHour() {
        setDistanceTraveled(this.speed);
    }

    boolean isBreakdown() {
        return isBreakdown;
    }
}
