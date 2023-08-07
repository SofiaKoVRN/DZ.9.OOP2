package ru.netology.radio;

public class Radio {

    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentNumberStation = minNumberStation;

    public int getMinNumberStation() {
        return minNumberStation;
    }
    public int getMaxNumberStation() {
        return maxNumberStation;
    }
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

    public Radio (int minNumberStation, int maxNumberStation) {
        this.minNumberStation = minNumberStation;
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
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
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

    public Radio (int size) {
        maxNumberStation = minNumberStation + size;
        maxVolume = minVolume + size;
    }

}
