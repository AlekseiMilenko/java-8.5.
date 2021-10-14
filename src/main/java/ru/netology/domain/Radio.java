package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;

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

    public void increaseVolume() {
        if (currentVolume < 10 && currentVolume >= 0 ) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume () {
            if (currentVolume > 0 && currentVolume <= 10) {
                currentVolume = currentVolume - 1;
            } else {
                currentVolume = 0;
            }
        }

        public void increaseStation () {
            if (currentStation < 9 && currentStation >=0) {
                currentStation = currentStation + 1;
            } else {
                currentStation = 0;
            }
        }

        public void decreaseStation () {
            if (currentStation > 0 && currentStation <= 9) {
                currentStation = currentStation - 1;
            } else {
                currentStation = 9;
            }
        }

    public int getStation() {
        return currentStation;
    }

    public void setStation (int actualStation ){
            if (actualStation <= 0) {
                return;
            }
            if (actualStation > 9) {
                return;
            }
            currentStation = actualStation;
        }

}
