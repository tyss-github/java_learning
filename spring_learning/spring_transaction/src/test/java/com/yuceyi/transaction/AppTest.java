package com.yuceyi.transaction;

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
        System.out.println("=========================================");
    }

    @Test
    public void testTransaction1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 1000);
    }

    @Test(expected=ArithmeticException.class)
    public void testTransaction2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 400);
    }

    @Test
    public void testTransaction3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 1000);
    }

    @Test(expected=ArithmeticException.class)
    public void testTransaction4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 400);
    }

    @Test
    public void testTransaction5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 1000);
    }

    @Test(expected=ArithmeticException.class)
    public void testTransaction6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("aaa", "bbb", 400);
    }
}
