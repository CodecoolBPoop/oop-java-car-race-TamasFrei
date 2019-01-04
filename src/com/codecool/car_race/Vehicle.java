package com.codecool.car_race;

abstract class Vehicle {

    private String name;
    private Type type;
    private int distanceTraveled = 0;

    Vehicle(Type type) {
        this.type = type;
    }

    abstract void prepareForLap(Race race);

    abstract void moveForAnHour();



    Type getType() {
        return type;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    protected enum Type {
        CAR,
        MOTORCYCLE,
        TRUCK
    }
}
