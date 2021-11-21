package ru.job4j.collection;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpNameDesc = new JobDescByName();
        int rsl = cmpNameDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriorityDesc = new JobDescByPriority();
        int rsl = cmpPriorityDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

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
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriorityDesc = new JobByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriorityDesc.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 3)
        );
        assertThat(rsl, greaterThan(0));
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