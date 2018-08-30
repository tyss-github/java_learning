package com.yuceyi.aop;

public class Transaction {
    public void before() {
        System.out.println("开启事务");
    }

    public void after() {
        System.out.println("关闭事务");
    }
}
