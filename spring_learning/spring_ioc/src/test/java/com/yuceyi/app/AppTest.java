package com.yuceyi.app;

import org.junit.Test;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before
    public void runBeforeTest(){
        System.out.println("=============================================");
    }

    @Test
    public void testCreateObjectByConstrutor(){
        //1、启动 spring 容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context1.xml");
        //2、从 spring 容器中取出数据
        HelloIoc IOC = (HelloIoc) context.getBean("helloIoc");
        //3、通过对象调用方法
        IOC.sayHello();
         
        //利用配置文件 alias 别名属性创建对象
        HelloIoc IOC2 = (HelloIoc) context.getBean("helloIoc2");
        IOC2.sayHello();
    }

    @Test
    public void testCreateObjectByStaticFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context1.xml");
        HelloIoc staticFactory =
                (HelloIoc) context.getBean("helloStaticFactory");
        staticFactory.sayHello();
    }

    @Test
    public void testCreateObjectInstanceFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context1.xml");
        HelloIoc staticFactory =
                (HelloIoc) context.getBean("instance");
        staticFactory.sayHello();
    }

    //spring 容器的初始化和销毁
    @Test
    public void testSpringLifeCycle(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
        SpringLifeCycle hello = (SpringLifeCycle) context.getBean("springLifeCycle");
         
        hello.sayHello();
         
        //销毁spring容器
        ClassPathXmlApplicationContext classContext = (ClassPathXmlApplicationContext) context;
        classContext.close();
    }
}
