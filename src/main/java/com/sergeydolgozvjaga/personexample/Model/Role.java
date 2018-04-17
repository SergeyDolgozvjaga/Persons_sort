package com.sergeydolgozvjaga.personexample.Model;

import java.io.Serializable;
/**
* Enum describes presented Roles
* */
public enum Role implements Serializable{

    MANAGER,
    ADMIN,
    USER;

    String roles(){
        switch (this){
            case     USER:     return  "I'm user";
            case     ADMIN:    return  "I'm admin";
            case     MANAGER:  return  "I'm manager";
            default:           return  "choose role, please";
        }
    }
}
