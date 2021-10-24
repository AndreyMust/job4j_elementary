package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To8Then4() {
        int left = 2;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax123To5Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6789To5Then9() {
        int a = 9;
        int b = 6;
        int c = 7;
        int d = 8;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}