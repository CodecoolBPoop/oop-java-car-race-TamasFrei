package com.codecool.car_race;

class Weather {

    private boolean isRaining = false;
    private boolean[] weather = {true, true, true, false, false, false, false, false, false, false};

    void setRaining() {
        this.isRaining = weather[getRandomNumber()];
    }

    private byte getRandomNumber() {
        return (byte)(Math.random() * 9);
    }

    boolean getIsRaining() {
        return isRaining;
    }
}
