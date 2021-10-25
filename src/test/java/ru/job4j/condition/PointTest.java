package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to04then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to23then2() {
        double expected = 3.6;
        Point a = new Point(2, 0);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}