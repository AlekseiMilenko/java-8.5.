package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiServiceTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(53);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 54;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromUpperLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(radioVolume.getMaxVolume());

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromAboveLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(101);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = radioVolume.getMaxVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(radioVolume.getMinVolume());

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromLowerBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(-1);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = radioVolume.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(71);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 70;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromUpperLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(radioVolume.getMaxVolume());

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromAboveLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(101);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = radioVolume.getMinVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(radioVolume.getMinVolume());

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromLowerBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(-1);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = radioVolume.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsAmount () {
        Radio radioStation = new Radio(11);

        int actual = radioStation.getStationsAmount();
        int expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(2);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromUpperLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(radioStation.getStationsAmount() - 1);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromAboveLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(10);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromBottomLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromLowerBottomLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-2);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationFromUpperLimit() {
        Radio radioStation = new Radio(20);
        radioStation.setCurrentStation(radioStation.getStationsAmount() - 1);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = (radioStation.getStationsAmount() - 1) - 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromAboveLimit() {
        Radio radioStation = new Radio(15);
        radioStation.setCurrentStation(17);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromBottomLimit() {
        Radio radioStation = new Radio(8);
        radioStation.setCurrentStation(0);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationFromLowerBottomLimit() {
        Radio radioStation = new Radio(66);
        radioStation.setCurrentStation(-2);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getStationsAmount() - 1;

        assertEquals(expected, actual);
    }





    @Test
    public void shouldIncreaseStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(5);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseStationFromUpperLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(9);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromAboveLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(10);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromBottomLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromLowerBottomLimitDefaultStationsAmount() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-1);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationFromUpperLimit() {
        Radio radioStation = new Radio(15);
        radioStation.setCurrentStation(radioStation.getStationsAmount() -1);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getMinStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromAboveLimit() {
        Radio radioStation = new Radio(55);
        radioStation.setCurrentStation(56);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getMinStationNumber();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromBottomLimit() {
        Radio radioStation = new Radio(23);
        radioStation.setCurrentStation(radioStation.getMinStationNumber());

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromLowerBottomLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-1);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = radioStation.getMinStationNumber();

        assertEquals(expected, actual);
    }

        @Test
        public void shouldSetStationDefaultStationsAmount () {
            Radio radioStation = new Radio();

            radioStation.setStation(5);

            int actual = radioStation.getStation();
            int expected = 5;

            assertEquals(expected, actual);
        }

    @Test
    public void shouldSetStation () {
        Radio radioStation = new Radio(59);

        radioStation.setStation(50);

        int actual = radioStation.getStation();
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromUpperLimit () {
        Radio radioStation = new Radio(15);

        radioStation.setStation(radioStation.getStationsAmount() -1);

        int actual = radioStation.getStation();
        int expected = 14;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationFromAboveLimit () {
        Radio radioStation = new Radio(22);

        radioStation.setStation(23);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromBottomLimit () {
        Radio radioStation = new Radio(96);

        radioStation.setStation(0);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromLowerBottomLimit () {
        Radio radioStation = new Radio(20);

        radioStation.setStation(-1);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationFromUpperLimitDefaultStationsAmount () {
        Radio radioStation = new Radio();

        radioStation.setStation(9);

        int actual = radioStation.getStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationFromAboveLimitDefaultStationsAmount () {
        Radio radioStation = new Radio();

        radioStation.setStation(10);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromBottomLimitDefaultStationsAmount () {
        Radio radioStation = new Radio();

        radioStation.setStation(0);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromLowerBottomLimitDefaultStationsAmount () {
        Radio radioStation = new Radio();

        radioStation.setStation(-1);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

}
