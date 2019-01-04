package com.codecool.car_race;

public class Motorcycle extends Vehicle {

    private int speed;

    protected Motorcycle(int numOfInstance) {
        super(Type.MOTORCYCLE);
        setName(createName(numOfInstance));
    }

    @Override
    void prepareForLap(Race race) {
        this.speed = 100;
        if (race.getWeather().getIsRaining()) {
            this.speed -= (int)(Math.random() * 45 + 5);
        }
    }

    @Override
    void moveForAnHour() {
        setDistanceTraveled(this.speed);
    }

    private String createName(int numOfInstance) {
        return "Motorcycle " + numOfInstance;
    }
}
