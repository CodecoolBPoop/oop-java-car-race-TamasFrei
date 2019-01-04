package com.codecool.car_race;

import java.util.ArrayList;

class Race {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Weather weather = new Weather();

    void simulateRace(Race race) {
        for (int i = 0; i < 50; i++) {
            weather.setRaining();
            for (Vehicle vehicle: race.getVehicles()) {
                vehicle.prepareForLap(race);
            }
            for (Vehicle vehicle: race.getVehicles()) {
                vehicle.moveForAnHour();
            }
        }
    }

    void printRaceResults() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getName() + ": " + vehicle.getDistanceTraveled() + "km  " + vehicle.getType());
        }
    }

    boolean isThereABrokenTruck(Race race) {
        for (Vehicle vehicle: race.getVehicles()) {
            if (vehicle.getType().equals(Vehicle.Type.TRUCK)) {
                Truck truck = (Truck)vehicle;
                if (truck.isBreakdown()) {
                    return true;
                }
            }
        }
        return false;
    }

    private ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }


    Weather getWeather() {
        return weather;
    }

}
