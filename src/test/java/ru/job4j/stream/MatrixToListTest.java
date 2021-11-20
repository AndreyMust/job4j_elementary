package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void makeListTest() {
        Integer[][] matrix = new Integer[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> rsl = MatrixToList.makeList(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(rsl, is(expected));
    }
}