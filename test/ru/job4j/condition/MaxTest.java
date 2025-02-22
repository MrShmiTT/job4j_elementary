package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int expected = 2;
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To1Then5() {
        int expected = 5;
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To1Then1() {
        int expected = 1;
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

}