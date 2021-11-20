package ru.job4j.stream;

import java.util.*;
import java.util.stream.*;

public class MatrixToList {
    public static List<Integer> makeList(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
