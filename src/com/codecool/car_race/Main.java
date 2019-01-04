package com.codecool.car_race;


public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 1; i <= 10; i++) {
            Car car = new Car();
            race.addVehicle(car);
            Motorcycle motorcycle = new Motorcycle(i);
            race.addVehicle(motorcycle);
            Truck truck = new Truck();
            race.addVehicle(truck);
        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace(race);
        race.printRaceResults();
    }
}
