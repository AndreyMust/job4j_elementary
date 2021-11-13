package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Волокно",
                "Яблоко"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenRightEmptyShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Строка",
                ""
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenLeftEmptyShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "",
                "Строка"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenRightAndLeftSetNumberShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "8",
                "7"
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }
}