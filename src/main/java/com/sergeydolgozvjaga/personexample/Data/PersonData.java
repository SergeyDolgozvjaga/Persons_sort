package com.sergeydolgozvjaga.personexample.Data;

import com.sergeydolgozvjaga.personexample.Model.Person;
import com.sergeydolgozvjaga.personexample.Model.Role;

import java.util.ArrayList;

/**
* Class contains data (Person list)
* */
public class PersonData {

    /**
     *Method return List of all Persons
     **/
    public ArrayList<Person> getAllPersons(){
        return getPersonas();
    }

    /**
     * Method, that conclude Person's data
     * */
    private ArrayList<Person> getPersonas(){
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person(1,  "John",     35, Role.ADMIN));
        persons.add(new Person(2,  "Peter",    23, Role.USER));
        persons.add(new Person(3,  "Sam",      45, Role.MANAGER));
        persons.add(new Person(4,  "John",     43, Role.MANAGER));
        persons.add(new Person(5,  "Samantha", 25, Role.USER));
        persons.add(new Person(6,  "Samuel",   67, Role.USER));
        persons.add(new Person(7,  "Sam",      81, Role.USER));
        persons.add(new Person(8,  "Jack",     29, Role.ADMIN));
        persons.add(new Person(9,  "Penelope", 32, Role.MANAGER));
        persons.add(new Person(10, "Peter",    42, Role.MANAGER));
        persons.add(new Person(11, "Lee",      36, Role.USER));
        persons.add(new Person(12, "Monkey",   62, Role.USER));
        persons.add(new Person(13, "Lee",      52, Role.USER));
        persons.add(new Person(14, "Lui",      32, Role.USER));
        persons.add(new Person(15, "Peter",    30, Role.MANAGER));
        persons.add(new Person(16, "Lee",      32, Role.USER));
        persons.add(new Person(17, "John",     37, Role.USER));
        persons.add(new Person(18, "Lui",      31, Role.MANAGER));
        persons.add(new Person(19, "Samuel",   21, Role.ADMIN));
        persons.add(new Person(20, "Mahmud",   20, Role.USER));

        return persons;

    }

}
