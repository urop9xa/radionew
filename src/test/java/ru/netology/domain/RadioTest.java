package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }


    @Test
    void changeOnPreviousRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnPreviousRadioStation(currentRadioStation);
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void changeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setVolume() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setMaxVolume(volume);
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void setMinVolume() {
    }
}