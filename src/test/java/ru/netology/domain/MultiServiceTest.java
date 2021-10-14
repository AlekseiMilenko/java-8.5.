package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiServiceTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(2);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromUpperLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(10);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromAboveLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(11);

        radioVolume.increaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(0);

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
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(2);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromUpperLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(10);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromAboveLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(11);

        radioVolume.decreaseVolume();

        int actual = radioVolume.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromBottomLimit() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(0);

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
        int expected = 0;

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
    public void shouldDecreaseStationFromUpperLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(9);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }@Test
    public void shouldDecreaseStationFromAboveLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(10);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }@Test
    public void shouldDecreaseStationFromBottomLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }@Test
    public void shouldDecreaseStationFromLowerBottomLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-2);

        radioStation.decreaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 9;

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
    public void shouldIncreaseStationFromUpperLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(9);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromAboveLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(10);

        radioStation.increaseStation();

        int actual = radioStation.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationFromBottomLimit() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);

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
        int expected = 0;

        assertEquals(expected, actual);
    }

        @Test
        public void shouldSetStation () {
            Radio radioStation = new Radio();

            radioStation.setStation(5);

            int actual = radioStation.getStation();
            int expected = 5;

            assertEquals(expected, actual);
        }

    @Test
    public void shouldSetStationFromUpperLimit () {
        Radio radioStation = new Radio();

        radioStation.setStation(9);

        int actual = radioStation.getStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationFromAboveLimit () {
        Radio radioStation = new Radio();

        radioStation.setStation(10);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromBottomLimit () {
        Radio radioStation = new Radio();

        radioStation.setStation(0);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }@Test
    public void shouldSetStationFromLowerBottomLimit () {
        Radio radioStation = new Radio();

        radioStation.setStation(-1);

        int actual = radioStation.getStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

}
