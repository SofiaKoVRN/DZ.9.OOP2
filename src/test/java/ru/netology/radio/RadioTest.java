package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testMinNumberStation() {
        Radio radio = new Radio(9);
        Assertions.assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void testMaxNumberStation() {
        Radio radio = new Radio(9);
        Assertions.assertEquals(9, radio.getMaxNumberStation());
    }

    @Test
    public void testCurrentNumberStation() {
        Radio radio = new Radio(9);
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(0,9);
        radio.setCurrentNumberStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation0() {
        Radio radio = new Radio(0,9);
        radio.setCurrentNumberStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation9() {
        Radio radio = new Radio(0,9);
        radio.setCurrentNumberStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation1() {
        Radio radio = new Radio(0,9);
        radio.setCurrentNumberStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio(0,9);
        radio.setCurrentNumberStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    //VOLUME
    @Test
    public void testMinVolume() {
        Radio radio = new Radio(100);
        Assertions.assertEquals(0, radio.getMinVolume());
    }
    @Test
    public void testMaxVolume() {
        Radio radio = new Radio(100);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void testMCurrentVolume() {
        Radio radio = new Radio(100);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetLouderVolume100() {
        Radio radio = new Radio(0, 99);
        radio.setCurrentVolume(99);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLouderVolume101() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(100);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLouderVolume1() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(0);
        radio.louderVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLouderVolume2() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(1);
        radio.louderVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetQuietVolume99() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(100);
        radio.quietVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetQuietVolume98() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(99);
        radio.quietVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetQuietVolume1() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(2);
        radio.quietVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetQuietVolume0() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(1);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetQuietVolume00() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(0);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}