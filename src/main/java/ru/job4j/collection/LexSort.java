package ru.job4j.collection;

import java.util.Comparator;
import java.util.Arrays;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int a = Integer.parseInt(left.split(". ")[0]);
        int b = Integer.parseInt(right.split(". ")[0]);
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        String[] input = {"10. Task.", "1. Task.", "2. Task."};
        Arrays.sort(input, new LexSort());
        for (String word : input) {
            System.out.println(word);
        }
    }
}
