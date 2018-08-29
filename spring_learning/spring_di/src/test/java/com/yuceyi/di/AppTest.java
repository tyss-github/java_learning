package com.yuceyi.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testSet(){
        //1、启动 spring 容器
        //2、从 spring 容器中取出数据
        //3、通过对象调用方法
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getPname());//vae
    }

    @Test
    public void testConstrutor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person_con");
        System.out.println(person.getStudents().getSname());
        System.out.println(person.getPid());//1
    }
}
