package com.yuceyi.aop;

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
    public void doBefore() {
        System.out.println("======================================");
    }

    @Test
    public void testAop1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("testUser");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(user);
        userService.deleteUser(1);
    }

    @Test
    public void testAop2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        User user = (User) context.getBean("testUser");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(user);
    }

    @Test(expected=ArithmeticException.class)
    public void testAop3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.deleteUser(0);
    }
}
