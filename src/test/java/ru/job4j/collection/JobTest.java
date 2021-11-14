package ru.job4j.collection;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorDescByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void comparatorJobAscByPriority() {
        Comparator<Job> ascPriority = new JobByPriority();
        List<Job> jobs = Arrays.asList(
                new Job("A", 4),
                new Job("B", 3),
                new Job("C", 2),
                new Job("D", 1)
        );
        List<Job> expectedJobs = Arrays.asList(
                new Job("D", 1),
                new Job("C", 2),
                new Job("B", 3),
                new Job("A", 4)

        );
        Collections.sort(jobs, ascPriority);
        assertThat(jobs, is(expectedJobs));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bugg", 4)
        );
        List<Job> expectedJobs = Arrays.asList(
                        new Job("Fix bug", 1),
                        new Job("Fix bug", 2),
                        new Job("Fix bug", 4),
                        new Job("Fix bugg", 4)
                );
        Comparator<Job> comb = new JobByName()
                .thenComparing(new JobDescByNameLn())
                .thenComparing(new JobByPriority());
        Collections.sort(jobs, comb);
        assertThat(jobs, is(expectedJobs));
    }
}