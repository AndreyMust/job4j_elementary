package ru.job4j.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> makeMap(List<Student> students) {
        return students.stream().distinct()
                .collect(Collectors.toMap(student -> student.getSurname(),
                                            student -> student)
                );
    }

    /**
     * Это вариант Collectors.toMap с третим параметром для замены дубликатов
     * (existing, replacement) -> existing
     * @param students список Студентов
     * @return Map из списка Студентов
     */
    public Map<String, Student> makeMapV2(List<Student> students) {
        return students.stream().distinct()
                .collect(Collectors.toMap(student -> student.getSurname(),
                        student -> student,
                        (existing, replacement) -> existing)
                );
    }
}
