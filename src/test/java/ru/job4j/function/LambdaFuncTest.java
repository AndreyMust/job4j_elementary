package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaFuncTest {

    @Test
    public void whenLinearFunctionThenLinearResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11d, 13d, 15d);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.diapason(5, 8, x -> 1 * (x * x) + 1);
        List<Double> expected = Arrays.asList(26d, 37d, 50d);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.diapason(2, 5, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(5d, 9d, 17d);
        assertThat(rsl, is(expected));
    }
}