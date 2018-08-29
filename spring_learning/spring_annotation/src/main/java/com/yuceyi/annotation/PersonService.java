package com.yuceyi.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {
    @Autowired
    private PersonDao personDaoImplOne;

    public void savePerson(){
        this.personDaoImplOne.savePerson();
    }
}
