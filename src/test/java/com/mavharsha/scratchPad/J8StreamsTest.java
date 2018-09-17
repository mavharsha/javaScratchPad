package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class J8StreamsTest {

    @Test
    public void testMinOfIntArray() {
        assertEquals(J8Streams.getMinValueInArray(new int[]{52, 44, 10, 23}), 10);
        assertEquals(J8Streams.getMinValueInArray(new int[]{-52, 44, 10, 23}), -52);
    }

    @Test(expected = NoSuchElementException.class)
    public void minOfIntArrayShouldThrowExceptionWhenPassedWithEmptyArray() {
        J8Streams.getMinValueInArray(new int[]{});
    }

    @Test
    public void testMinElementOfIntStream() {
        assertEquals(J8Streams.getMinValueInStream(IntStream.range(10, 20)), 10);
        assertEquals(J8Streams.getMinValueInStream(IntStream.range(-120, -10)), -120);
    }

    @Test(expected = NoSuchElementException.class)
    public void minOfIntStreamShouldThrowExceptionWhenPassedWithEmptyIntStream() {
        J8Streams.getMinValueInStream(IntStream.empty());
        J8Streams.getMinValueInStream(IntStream.range(-10, -120));
    }

    /* Handy IntStream methods. */
    @Test
    public void handyIntStreamMethods() {
        int[] array = {10, 20, 25, 45, 1, 2, 6, 7, 8};

        System.out.println("Min: " + IntStream.of(array).min().getAsInt());
        System.out.println("Max: " + IntStream.of(array).max().getAsInt());
        System.out.println("Avg: " + IntStream.of(array).average().getAsDouble());
        System.out.println("Count: " + IntStream.of(array).count());
        System.out.println("Sum: " + IntStream.of(array).sum());
    }

    @Test
    public void anotherUtilityForIntStream() {
        int[] array = {10, 20, 25, 45, 1, 2, 6, 7, 8};
        IntSummaryStatistics summaryStatistics = IntStream.of(array).summaryStatistics();

        System.out.println("Min: " + summaryStatistics.getMin());
        System.out.println("Max: " + summaryStatistics.getMax());
        System.out.println("Avg: " + summaryStatistics.getAverage());
        System.out.println("Count: " + summaryStatistics.getCount());
        System.out.println("Sum: " + summaryStatistics.getSum());
    }

    @Test
    public void getTopThreeElementsOfAnArray() {
        int[] array = {10, 20, 2, 25, 45, 1, 2, 6, 7, 8};

        List<Integer> list = IntStream.of(array)
                                        .boxed()
                                        .distinct()
                                        .sorted()
                                        .limit(3)
                                        .collect(Collectors.toList());
        
        assertEquals(list.get(0).intValue(), 1);
        assertEquals(list.get(1).intValue(), 2);
        assertEquals(list.get(2).intValue(), 6);
    }

    /*
    * Streams can also be used with OBJECTS
    * */


    @Test
    public void streamsOfEmployee() {
        List<J8Streams.Employee> employees = J8Streams.Employee.getEmployees();
        List<String> employeeNames = employees.stream().map(J8Streams.Employee::getName).collect(Collectors.toList());
        assertEquals(employeeNames.size(), 3);
    }

    @Test
    public void streamOfElementsSortedBasedOnAge() {
        List<J8Streams.Employee> employees = J8Streams.Employee.getEmployees();
        List<J8Streams.Employee> employeeSorted = employees.stream().sorted(Comparator.comparingInt(J8Streams.Employee::getAge).reversed()).collect(Collectors.toList());
         assertTrue(employeeSorted.get(0).getAge() > employeeSorted.get(1).getAge());
         assertTrue(employeeSorted.get(1).getAge() > employeeSorted.get(2).getAge());
    }


    @Test
    public void oldestEmployeeInStreamOfEmployees() {
        List<J8Streams.Employee> employees = J8Streams.Employee.getEmployees();
        List<J8Streams.Employee> employee = employees.stream().sorted(Comparator.comparingInt(J8Streams.Employee::getAge).reversed()).limit(1).collect(Collectors.toList());
        assertEquals(employee.size(), 1);
        assertTrue(employee.get(0).getName().equalsIgnoreCase("Second"));
    }

    // There are different types of collectors.
    // Collectors.toList
    // Collectors.toSet
    // Collectors.toMap(e -> name, e -> e) -- returns a Map<String, Employee>
    // Collector.joining(<delimiter>) -- concat all the values with a delimiter
    // Collector.groupingBy(e -> e.department) -- returns Map<String, List<Employee>>
}