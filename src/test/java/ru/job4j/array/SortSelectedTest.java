package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray0f3elements() {
        int[] data = new int[] {1, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray0f5elements() {
        int[] data = new int[] {10, 0, 9, 8, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}