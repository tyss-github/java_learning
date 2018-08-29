package com.yuceyi.annotation;

import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before
    public void doBefore(){
        System.out.println("=======================================");
    }

    @Test
    public void testAnnotation(){
        //1、启动 spring 容器
        //2、从 spring 容器中取出数据
        //3、通过对象调用方法
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getPname());
    }

    @Test
    public void testResource(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        person.showStudent();
    }

    @Test
    public void testAutowired(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService = (PersonService) context.getBean("personService");
        personService.savePerson();
    }
}
