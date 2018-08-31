package com.mavharsha.scratchPad;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class OptionalJ8Test {

    @Test
    public void testCreateEmptyOptional() {
        Optional<String> value = Optional.empty();
        assertFalse(value.isPresent());
    }

    @Test
    public void testCreateOptionalOfNonNull() {
        String string = "test string";
        Optional<String> value = Optional.of(string);
        assertTrue(value.isPresent());
        assertNotNull(value.get());
    }


    /*
    * Optional.of() throws NP when the value passed is null
    * */
    @Test(expected = NullPointerException.class)
    public void testNullPointerExceptionForNulls() {
        String string = null;
        Optional<String> value = Optional.of(string);
    }


    @Test
    public void testOptionalPassedMayBeANull() {
        String string = null;
        Optional<String> value = Optional.ofNullable(string);
        assertFalse(value.isPresent());
        assertEquals("Optional.empty", value.toString());
    }

    /*
    * Optional IfPresent
    * */
    @Test
    public void testOptionalIfPresentFunctionalStyle() {
        String string = "Hello World!";
        Optional<String> value = Optional.ofNullable(string);

        value.ifPresent(name -> System.out.println(name));
        assertNotNull(value.get());
    }

    /*
    * Optional with defaults
    * */
    @Test
    public void testOptionalWithDefaults() {
        String string = null;
        String value = Optional.ofNullable(string).orElse("Hello World");
        assertTrue(value.equalsIgnoreCase("Hello World"));
    }

    @Test
    public void testOptionalWithDefaultValueWithOrElseGet() {
        String string = null;
        String value = Optional.ofNullable(string).orElseGet(() -> "hello world!");
        assertTrue(value.equalsIgnoreCase("Hello World!"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAnExceptionWhenTheOptionalPassedIsNull() {
        String string = null;
        String value = Optional.ofNullable(string).orElseThrow(IllegalArgumentException::new);
    }


    @Test
    public void testMapOnOptionals() {
        List<String> names = Arrays.asList("First", "Second", "Third");
        Optional<List<String>> optionalStrings = Optional.ofNullable(names);

        int size = optionalStrings.map(List::size).orElse(0);
        assertTrue(names.size() == size);
    }



    @Test
    public void testOptionalOfObject() {
        User user = new User("username", "password");
        Optional<String> password = Optional.ofNullable(user.getPassword());
        Pattern.compile(".*[A-Z].*").matcher(password.get()).matches();
    }


    private class User{
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}