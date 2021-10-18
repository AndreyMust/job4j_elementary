package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива 1 равен: " + ages.length);
        System.out.println("Размер массива 2 равен: " + surnames.length);
        System.out.println("Размер массива 3 равен: " + prices.length);
    }
}
