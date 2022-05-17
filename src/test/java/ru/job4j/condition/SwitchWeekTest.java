package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void monday() {
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void tuesday() {
        String result = SwitchWeek.nameOfDay(2);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wednesday() {
        String result = SwitchWeek.nameOfDay(3);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thursday() {
        String result = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void friday() {
        String result = SwitchWeek.nameOfDay(5);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void saturday() {
        String result = SwitchWeek.nameOfDay(6);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sunday() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void error() {
        String result = SwitchWeek.nameOfDay(8);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}