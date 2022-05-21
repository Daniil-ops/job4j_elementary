package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(in, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(in, expected);
    }
}