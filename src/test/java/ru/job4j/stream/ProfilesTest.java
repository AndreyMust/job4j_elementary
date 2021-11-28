package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Москва", "Иванова", 1, 33),
                        "Сергей", "Петров"));

        Profiles profile = new Profiles();
        List<Address> addresses = profile.collect(profiles);
        List<Address> expected = List.of(
                new Address("Москва", "Иванова", 1, 33));
        assertThat(addresses, is(expected));
    }

    @Test
    public void collectDistinct() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Москва", "Иванова", 1, 33),
                        "Сергей", "Петров"),
                new Profile(new Address("Москва", "Иванова", 1, 33),
                        "Алена", "Петрова")
        );

        Profiles profile = new Profiles();
        List<Address> addresses = profile.collectDistinct(profiles);
        List<Address> expected = List.of(
                new Address("Москва", "Иванова", 1, 33)
        );
        assertThat(addresses, is(expected));
    }
}