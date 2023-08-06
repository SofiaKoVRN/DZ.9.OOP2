package ru.netology.radio;

public class Radio {

    private int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextStation () {
        if (currentNumberStation != 9) {
            currentNumberStation++;
        } else {
            currentNumberStation = 0;
        }
    }
    public void prevStation () {
        if (currentNumberStation != 0) {
            currentNumberStation--;
        } else {
            currentNumberStation = 9;
        }
    }




    // VOLUME
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void louderVolume () {
        if (currentVolume < 100) {
            currentVolume++;
        } else return;
    }

    public void quietVolume () {
        if (currentVolume > 0) {
            currentVolume--;
        } else return;
    }
}
