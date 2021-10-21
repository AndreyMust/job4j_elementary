package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int last = array.length - 1;
        for (int i = 0; i <= last / 2; i++) {
            int tmp = array[last - i];
            array[last - i] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
