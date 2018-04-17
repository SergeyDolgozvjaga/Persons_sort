package com.sergeydolgozvjaga.personexample;


import com.sergeydolgozvjaga.personexample.Model.Person;
import com.sergeydolgozvjaga.personexample.Model.Role;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;


public class PersonSortTest {

    public List<Person> actual(){
        List<Person> actual = Arrays.asList(
                new Person(1, "John", 35, Role.ADMIN),
                new Person(2, "Peter", 23, Role.USER),
                new Person(3, "Sam", 45, Role.MANAGER)
        );
        return actual;
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringGetAllNames() {

        List<String> actualList = actual().stream()
                .map(x -> x.getName()).collect(Collectors.toList());

        assertThat(actualList, hasItems("Peter"));
    }

    @Test
    public void checkSize(){
        assertThat(actual(), hasSize(3));
    }

    @Test
    public void containAnyOrder(){

        List<String> actualList = actual().stream()
                .map(x -> x.getName()).collect(Collectors.toList());
        // Can be any order
        assertThat(actualList, containsInAnyOrder("Peter", "John", "Sam"));
    }


}
