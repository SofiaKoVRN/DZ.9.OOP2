package ru.netology.radio;

public class Radio {

    private int minNumberStation;
    private int maxNumberStation;
    private int currentNumberStation;

    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public Radio() {
        this.maxNumberStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int count) {
        this.maxNumberStation = count - 1;
        this.maxVolume = count - 1;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentNumberStation != maxNumberStation) {
            currentNumberStation++;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prevStation() {
        if (currentNumberStation != 0) {
            currentNumberStation--;
        } else {
            currentNumberStation = maxNumberStation;
        }
    }

    public void louderVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else return;
    }

    public void quietVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else return;
    }
}

