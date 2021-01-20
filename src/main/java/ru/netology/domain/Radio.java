package ru.netology.domain;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9){
            return;
        }
        if (currentRadioStation < 0){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
    public void changeOnPreviousRadioStation (int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        }
    }

    public void changeOnNextRadioStation (int currentRadioStation) {
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }
    public void setMaxVolume (int volume) {
        if (volume == 10) {
            this.volume = volume;
        }
    }
    public void setMinVolume (int volume) {
        if (volume == 0) {
            this.volume = volume;
        }
    }
    private int volume;
}