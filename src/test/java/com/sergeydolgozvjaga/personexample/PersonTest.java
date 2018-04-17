package com.sergeydolgozvjaga.personexample;

import com.sergeydolgozvjaga.personexample.Model.Person;
import com.sergeydolgozvjaga.personexample.Model.Role;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class PersonTest {

    public List<Person> actual(){
        List<Person> actual = Arrays.asList(
                new Person(1, "John", 35, Role.ADMIN),
                new Person(2, "Peter", 23, Role.USER),
                new Person(3, "Sam", 45, Role.MANAGER)
        );

        return actual;
    }


    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Before test");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    @org.junit.Test
    public void equalsPersons() {

        assertThat(actual(), hasItems(
                new Person(1, "John", 35, Role.ADMIN),
                new Person(2, "Peter", 23, Role.USER),
                new Person(3, "Sam", 45, Role.MANAGER)
        ));
    }

    @org.junit.Test
    public void equalsPersons2() {

        assertThat(actual(), containsInAnyOrder(
                new Person(1, "John", 35, Role.ADMIN),
                new Person(2, "Peter", 23, Role.USER),
                new Person(3, "Sam", 45, Role.MANAGER)
        ));
    }

    @org.junit.Test
    public void equalsPropertyPersonsAndValue() {

        //Test class property, and its value
        assertThat(actual(), containsInAnyOrder(
                hasProperty("name", is("John")),
                hasProperty("name", is("Peter")),
                hasProperty("name", is("Sam"))
        ));
    }
}
