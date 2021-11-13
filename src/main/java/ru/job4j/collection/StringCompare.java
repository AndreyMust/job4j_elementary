package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String str1, String str2)  {
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            int res = Character.compare(str1.charAt(i), str2.charAt(i));
            if (res != 0) {
                return res;
            }
        }
        return Integer.compare(str1.length(), str2.length());
    }
}
