package ru.job4j.function;

import java.util.*;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rls = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f)) {
                rls.add(f);
            }
        }
        return rls;
    }
}
