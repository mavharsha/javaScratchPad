package com.mavharsha.scratchPad;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import static org.junit.Assert.*;

public class StudentReflectionTest {

    /* Introspection of classFields */
    @Test
    public void testGetAllProperties() {
        Class clazz = Student.class;

        assertNotNull(clazz);

        Field[] fields = clazz.getDeclaredFields();

        for (Field field: fields){
            System.out.println(field);
        }

    }

    /* Introspection of classFields */
    @Test
    public void testSettingTheValues() {
        Student student = new Student();
        Class clazz = Student.class;

        assertNotNull(clazz);

        try {
            Field gpa = clazz.getDeclaredField("gpa");
            String string = "String";
            gpa.setAccessible(true);

            gpa.set(student, string);

            System.out.println(student.getGpa());

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    /* Introspection of classFields */
    @Test
    public void testIntrospectionMethods() {
        Student student = new Student();
        Class clazz = Student.class;
        assertNotNull(clazz);

        Method[] methods = clazz.getDeclaredMethods();
        Method getMethod;
        Method setMethod;

        assertEquals(2, methods.length);
        boolean isFirstGetter = StringUtils.contains(methods[0].getName(), "get");

        if (isFirstGetter){
            getMethod = methods[0];
            setMethod = methods[1];
        }else {
            getMethod = methods[1];
            setMethod = methods[0];
        }

        try {
            getMethod.setAccessible(true);
            Object originalGpa = getMethod.invoke(student);
            assertNull(originalGpa);
            assertEquals(null, (String) originalGpa);

            setMethod.setAccessible(true);
            setMethod.invoke(student, "new gpa");
            assertNotNull(getMethod.invoke(student));
            assertTrue("new gpa".equalsIgnoreCase((String)getMethod.invoke(student)));



        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


    /* Introspection of constructor */
    @Test
    public void testIntrospectionConstructor() {
        Student student = new Student();
        Class clazz = Student.class;
        assertNotNull(clazz);

        Constructor[] constructors = clazz.getDeclaredConstructors();
        Constructor noArgConstructor = null;

        assertNotNull(constructors);
        System.out.println(constructors.length);

        for (Constructor constructor: constructors) {
            Parameter[] parameters = constructor.getParameters();

            if(parameters.length == 0){
                noArgConstructor = constructor;
            }
        }

        if(noArgConstructor != null) {
            System.out.println("Has one no arg constructor");
        }

        try {
            Student student1 = (Student) noArgConstructor.newInstance();
            assertNotNull(student1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIntrospectAnnotation() {
        Student student = new Student();
        Class clazz = Student.class;
        assertNotNull(clazz);

        Annotation[] annotations = clazz.getAnnotations();

        for(Annotation annotation: annotations) {
            assertNotNull(annotation);

            if(annotation instanceof SimpleTestAnnotation){
                System.out.println(((SimpleTestAnnotation) annotation).message());
            }
        }
    }

}
