package com.sergeydolgozvjaga.personexample;

import com.sergeydolgozvjaga.personexample.Data.PersonData;
import com.sergeydolgozvjaga.personexample.Model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
* Class Serialize and Deserialize list of Persons
* */
public class Serialized {

    private final Logger logger = Logger.getLogger(String.valueOf(Serialized.class));

    String filename = "person.dat";
    private PersonData data;

    /**
    * Method serialize data to a file
    * */
    public void serialize(){

        logger.info("start serialize()");
        data = new PersonData();

        ArrayList<Person> personArrayList = data.getAllPersons();

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(personArrayList);
            logger.info("the record is done");
        }
        catch(Exception ex){
            logger.warning(ex.getMessage());
        }
        logger.info("exit serialize");
    }

    /**
    * Method deserialize data from file and show them
    * */
    public void deserialize(){

        logger.info("start deserialize");
        ArrayList<Person> newPeople = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            newPeople=(ArrayList<Person>)ois.readObject();
        }
        catch(Exception ex){
            logger.warning(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Имя: %s \t Возраст: %d \t Роль: %s \n", p.getName(), p.getAge(), p.getRole());
        logger.info("exit deserialize");
    }
}
