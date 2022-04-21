package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {

        float expected = 2;
        float euro = Converter.rubleToEuro(140);
        float eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    @Test
    public void whenConvert120RblThen2Dollar() {
        float expected = 3;
        float dollar = Converter.rubleToDollar(180);
        float eps = 0.0001f;
        Assert.assertEquals(expected, dollar, eps);
    }
}