package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }

    public static void main(String[] args) {
        Citizen b = new Citizen("AAA01", "Ivan");
        Citizen bCop = new Citizen("AAA01", "Ivan_2");
        Citizen c = new Citizen("AAA02", "Ivan2");
        PassportOffice passportOffice = new PassportOffice();
        System.out.println(passportOffice.add(b));
        System.out.println(passportOffice.add(c));
        System.out.println(passportOffice.add(bCop));
    }
}
