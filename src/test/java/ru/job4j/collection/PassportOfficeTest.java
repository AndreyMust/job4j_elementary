package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void add2Citizen() {
        Citizen citizenA = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenB = new Citizen("3344a", "Albert Petrov");
        PassportOffice office = new PassportOffice();
        office.add(citizenA);
        office.add(citizenB);
        assertThat(office.get(citizenA.getPassport()), is(citizenA));
    }

    @Test
    public void whenReturnNull() {
        Citizen citizen = new Citizen("rtx3090", "Albert Petrov");
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.add(citizen);
        assertNull(passportOffice.get("rtx1070"));
    }
}