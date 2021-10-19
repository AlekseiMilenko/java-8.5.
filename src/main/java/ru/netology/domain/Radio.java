package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int stationsAmount = 10;
    private int minStationNumber = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public void setStationsAmount(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume && currentVolume >= minVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume && currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseStation() {
        if (currentStation < stationsAmount - 1 && currentStation >= minStationNumber) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStationNumber;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStationNumber && currentStation <= stationsAmount - 1) {
            currentStation = currentStation - 1;
        } else {
            currentStation = stationsAmount - 1;
        }
    }

    public int getStation() {
        return currentStation;
    }

    public void setStation(int actualStation) {
        if (actualStation <= 0) {
            return;
        }
        if (actualStation > stationsAmount - 1) {
            return;
        }
        currentStation = actualStation;
    }

}
