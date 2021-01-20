package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentRadioStation () {
        Radio radio = new Radio(10, 10,40,100);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldSetCurrentRadioStationBackToZero () {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnPreviousRadioStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnPreviousRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(10,10,101,100);
        int volume = 101;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(10,10,-1,100);
        radio.setVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }


    @Test
    void volumeUpForOne() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 8;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 6;
        assertEquals(expected, radio.getVolume());

    }

}