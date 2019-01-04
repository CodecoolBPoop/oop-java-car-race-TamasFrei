package com.codecool.car_race;

public class Car extends Vehicle {

    private int speed = 0;
    private final String[] Names = {"Legacy", "Silver", "Whim", "Nimbus", "Nebula", "Apex", "Magic", "Heirloom", "Paradox", "Pyre",
                              "Eternity", "Mammoth", "Stardust", "Roamer", "Desire", "Wolf", "Vertex", "Supremacy", "Paladin", "Flow",
                              "Fragment", "Revelation", "Blizzard", "Buffalo", "Mammoth", "Tracer", "Presence", "Virtue", "Thriller", "Epiphany"};

    protected Car() {
        super(Type.CAR);
        setName(createName());
    }

    @Override
    protected void prepareForLap(Race race) {
        if (race.isThereABrokenTruck(race)) {
            this.speed = 75;
        } else {
            this.speed = (int)(Math.random() * 30 + 80);
        }
    }

    @Override
    void moveForAnHour() {
        setDistanceTraveled(this.speed);
    }

    private String createName() {
        return Names[(byte)(Math.random() * 30)] + " " + Names[(byte)(Math.random() * 30)];
    }
}
