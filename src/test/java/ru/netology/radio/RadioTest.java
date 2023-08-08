package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationMinus1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation0() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation8() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation9() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation10() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation9() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationNot() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation8() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation7() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(2);
        radio.prevStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation0() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation00() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    // VOLUME
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);

        int expected = 25;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void louderVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.louderVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void louderVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void louderVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quietVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.quietVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quietVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quietVolume00() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quietVolumeMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}