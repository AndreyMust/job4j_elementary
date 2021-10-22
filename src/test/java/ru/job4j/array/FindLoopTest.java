package ru.job4j.array;

import org.junit.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas99ThenMinus1() {
        int[] data = {1, 2, 44, 55, 66, 77};
        int el = 99;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind8() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int el = 8;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind2() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int el = 2;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}