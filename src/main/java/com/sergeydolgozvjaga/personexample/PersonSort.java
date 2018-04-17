package com.sergeydolgozvjaga.personexample;

import com.sergeydolgozvjaga.personexample.Data.PersonData;
import com.sergeydolgozvjaga.personexample.Model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
* Class sorted list of Persons in different ways
* */
public class PersonSort {

    private PersonData data;
    private final Logger logger = Logger.getLogger(String.valueOf(PersonSort.class));

    /**
    * Method sort Persons by Age
    * @return Persons, sorted by Age
    * */
    private List<Person> sortByAge(){
        logger.info("start sortByAge()");
        data = new PersonData();
        List<Person> personSortByAge = data.getAllPersons();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Person::getAge)));
        logger.info("exit sortByAge()");
        return personSortByAge;
    }

    /**
    * Method sort Persons by Name
    * @return Persons, sorted by Name
    * */
    private List<Person> sortByName(){
        logger.info("start sortByName()");
        data = new PersonData();
        List<Person> personSortByName = data.getAllPersons();
        personSortByName.sort(Comparator.nullsFirst(Comparator.comparing(Person::getName)));
        logger.info("exit sortByName()");
        return personSortByName;
    }

    /**
    * Method select List of Names
    * @return list of Names
    * */
    private List<String> getAllNames(){
        logger.info("start getAllNames()");
        data = new PersonData();
        List<String> getAllNames = data.getAllPersons().stream()
                .map(x -> x.getName()).collect(Collectors.toList());
        logger.info("exit getAllNames");
        return getAllNames;
    }

    /**
    * Method select all Names and count them, if they are same
    * @return all Names and count them, if they are same
    * */
    private Map<String, Long> countNames(){
        logger.info("start countNames()");
        Map<String, Long> countNames = getAllNames().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        logger.info("exit countNames");
        return countNames;
    }

    /**
    * Method select all Persons, sorted by Id
    * @return all Persons, sorted by Id
    * */
    private List<Person> unsortedList(){
        logger.info("start unsortedList");
        data = new PersonData();
        List<Person> personSortByAge = data.getAllPersons();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Person::getId)));
        logger.info("exit unsortedList");
        return personSortByAge;
    }

    /**
    * Method convert method sortByAge() to String
    * @return String converted method sortByAge()
    * */
    public String stringPersonSortByAge() {
        logger.info("start stringPersonSortByAge()");
        List<Person> list = sortByAge();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringPersonSortByAge()");
        return listString;
    }

    /**
    * Method convert method unsortedList() to String
    * @return String converted method unsortedList()
    * */
    public String stringPersonList(){
        logger.info("start stringPersonList");
        List<Person> list = unsortedList();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringPersonList");
        return listString;
    }

    /**
    * Method convert method sortByName() to String
    * @return String converted method sortByName()
    * */
    public String stringPersonSortByName() {
        logger.info("start stringPersonSortByName()");
        List<Person> list = sortByName();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringPersonSortByName()");
        return listString;
    }

    /**
    * Method convert method getAllNames() to String
    * @return String converted method getAllNames()
    * */
    public String stringGetAllNames() {
        logger.info("start stringGetAllNames()");
        List<String> list = getAllNames();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining("\n "));
        logger.info("exit stringGetAllNames()");
        return listString;
    }

    /**
    * Method print List of Persons
    * */
    public void printPersonUnsorted(){
        unsortedList().forEach(System.out::println);
    }

    /**
    * Method print Persons, sorted by age
    * */
    public void printPersonSortByAge(){
        sortByAge().forEach(System.out::println);
    }

    /**
    * Method print Persons, sorted by Name
    * */
    public void printPersonSortByName(){
        sortByName().forEach(System.out::println);
    }

    /**
    * Method print only Names
    * */
    public void printAllNames(){
        getAllNames().forEach(System.out::println);
    }

    /**
    * Method print Names , counting  - if Names are the same
    * */
    public void printAllCountNames(){
        System.out.println(countNames());
    }
}
