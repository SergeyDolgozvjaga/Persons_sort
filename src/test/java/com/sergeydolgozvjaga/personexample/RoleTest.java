package com.sergeydolgozvjaga.personexample;

import com.sergeydolgozvjaga.personexample.Model.Role;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoleTest {

    @org.junit.Before
    public void setUp() {
        System.out.println("Before test");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("After test");
    }

    @Test
    public void test(){
        Role role = Role.USER;
        assertEquals(role , Role.USER);

    }

    @Test
    public void test2(){
        Role role = Role.MANAGER;
        assertEquals(role , Role.MANAGER);
    }

    @Test
    public void test3(){
        Role role = Role.ADMIN;
        assertEquals(role , Role.ADMIN);
    }
}
