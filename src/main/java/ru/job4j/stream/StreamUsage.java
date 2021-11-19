package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{ name='"
                    + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 40),
                new Task("Task #2", 50),
                new Task("Bug #3", 100)
        );
        tasks.stream().filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent)
                .forEach(System.out::println);

        List<Integer> digits = new ArrayList<>(Arrays.asList(-1, -2, 3, 4, 5, -6));
        digits.stream().filter(x -> x > 0).forEach(System.out::println);
        List<Integer> res = digits.stream()
                            .filter(x -> x > 0)
                            .collect(Collectors.toList());
        System.out.println(res);
    }
}
