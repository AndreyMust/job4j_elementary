package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("0123", "Ivanov", "0001"),
                new Account("0456", "Petroff", "0002"),
                new Account("0789", "Sidoroff", "0003"),
                new Account("0123", "Alehperov", "0004"),
                new Account("0456", "Petroff_2", "0005")
        );
        System.out.println(sent(accounts));
    }
}
