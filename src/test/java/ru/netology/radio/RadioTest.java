package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testMinNumberStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void testMaxNumberStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(9, radio.getMaxNumberStation());
    }

    @Test
    public void testCurrentNumberStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void CurrentNumberStationMinus1() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentNumberStation0() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentNumberStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(1);

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentNumberStation8() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(8);

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentNumberStation9() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentNumberStation10() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation0() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation9() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation9() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation8() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation7() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(2);
        radio.prevStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation0() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinVolume() {
        Radio radio = new Radio(101);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void testMaxVolume() {
        Radio radio = new Radio(101);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void testMCurrentVolume() {
        Radio radio = new Radio(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void CurrentVolumeMinus1() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume0() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume1() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume99() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume100() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume101() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLouderVolume100() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(99);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLouderVolume101() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(100);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLouderVolume1() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(0);
        radio.louderVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLouderVolume2() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(1);
        radio.louderVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume99() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(100);
        radio.quietVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume98() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(99);
        radio.quietVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume1() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(2);
        radio.quietVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume0() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(1);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume00() {
        Radio radio = new Radio(101);
        radio.setCurrentVolume(0);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}