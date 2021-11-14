package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    tmp.add(start + "/" + el);
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> items = Departments.fillGaps(input);
        for (String item : items) {
            System.out.println(item);
        }
    }
}
