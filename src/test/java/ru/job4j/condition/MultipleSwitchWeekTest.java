package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void mondayEA() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void mondayRU() {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void tuesdayEA() {
        int result = MultipleSwitchWeek.numberOfDay("Tuesday");
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void tuesdayRU() {
        int result = MultipleSwitchWeek.numberOfDay("Вторник");
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void error() {
        int result = MultipleSwitchWeek.numberOfDay("Ошибка");
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}