package com.mavharsha.scratchPad;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
*
* For moarr information about streams in java
* https://www.youtube.com/watch?v=N3gQdIn90CI
* */
public class J8Streams {
    // IntStreams Streams
    // Intermediate operators -- maps filters limits
    // Collectors -- Collectors.joining Collectors.groupingBy Collectors.counting()

   /* public static List<Integer> getListOfIntegersBasedOnPredicate(IntStream stream, IntPredicate predicate) {
        return stream.filter(predicate).collect(Collectors.toList());
    }*/

   public static int getMinValueInArray(int[] intArray) {
       return IntStream.of(intArray).min().getAsInt();
   }

   public static int getMinValueInStream(IntStream integerStream) {
       return integerStream.min().getAsInt();
   }

    public static class Employee{
        private String name;
        private int age;
        private String gender;

        public Employee(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        static List<Employee> getEmployees() {
            return Arrays.asList(new Employee("first", 21, "Male"), new Employee("Second", 25, "Male"), new Employee("Third", 22, "Female"));
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

}
