package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public List<Address> collectDistinct(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
