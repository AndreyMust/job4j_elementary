package ru.job4j.lambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        int total = 0;
        for (int num : number) {
            int finalTotal = total;
            total = add(
                    () -> finalTotal + num
            );
        }
        System.out.println("total = " + total);
        System.out.println(Arrays.toString(number));
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
