package ru.job4j.stream;

import java.util.Objects;

public class Profile {
    private Address address;
    private String name;
    private String surname;

    public Profile(Address address, String name, String surname) {
        this.address = address;
        this.name = name;
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address)
                && Objects.equals(name, profile.name)
                && Objects.equals(surname, profile.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, surname);
    }
}
