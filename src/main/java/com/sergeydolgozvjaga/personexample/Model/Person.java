package com.sergeydolgozvjaga.personexample.Model;

import java.io.Serializable;
import java.util.List;
/**
* Class describes fields of Person
* */
public class Person implements Serializable{

    private int id;
    private String name;
    private int age;
    private Role role;

    public Person(int id, String name, int age, Role role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("***** Person Details *****\n");
        sb.append("ID="+getId()+"\n");
        sb.append("Name="+getName()+"\n");
        sb.append("Age="+getAge()+"\n");
        sb.append("Role="+getRole()+"\n");
        sb.append("*****************************");
        return sb.toString();

    }


}
