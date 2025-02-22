package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To00Then1() {
        double expected = 1;
        int x1 = 1;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To00Then141() {
        double expected = 1.41;
        int x1 = 1;
        int x2 = 1;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To10Then1() {
        double expected = 1;
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12To34Then282() {
        double expected = 2.82;
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}