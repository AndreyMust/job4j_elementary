package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Москва", "Иванова", 1, 33),
                        "Сергей", "Петров"));

        Profiles profile = new Profiles();
        List<Address> addresses = profile.collect(profiles);
        List<Address> expected = Arrays.asList(
                new Address("Москва", "Иванова", 1, 33));
        assertThat(addresses, is(expected));
    }
}