package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[]{9, 7, 8, 6, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{12, 7, 13, 8, 11, 17, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{7, 8, 9, 10, 11, 12, 13, 17};
        Assert.assertArrayEquals(expected, result);
    }
}