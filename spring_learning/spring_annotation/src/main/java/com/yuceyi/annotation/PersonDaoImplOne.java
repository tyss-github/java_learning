package com.yuceyi.annotation;

import org.springframework.stereotype.Component;

@Component
public class PersonDaoImplOne implements PersonDao{
    
    @Override
    public void savePerson(){
        System.out.println("save person one");
    }
}
