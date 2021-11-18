package ru.job4j.lambda;

import java.util.*;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 333", 120),
                new Attachment("image 22", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };
        Arrays.sort(atts, comparator);
        for (Attachment a : atts) {
            System.out.println(a);
        }

        String[] arrString = {
                new String("Name 1"),
                new String("Name 333"),
                new String("Name 22")
        };
        Comparator<String> cmpText  = (left, right) -> left.compareTo(right);
        Arrays.sort(arrString, cmpText);
        for (String s : arrString) {
            System.out.println(s);
        }

        Comparator<String> cmpDescSize  = (left, right) ->  Integer.compare(right.length(), left.length());
        Arrays.sort(arrString, cmpDescSize);
        for (String s : arrString) {
            System.out.println(s);
        }

        String[] names = {
                "Ivan",
                "Petr"
        };
        System.out.println("Test execute comparator");
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
    }
}
