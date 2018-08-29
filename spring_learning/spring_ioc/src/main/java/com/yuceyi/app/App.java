package com.yuceyi.app;

import org.junit.Test;
import com.yuceyi.app.HelloIoc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        String cp = System.getProperty("java.class.path");
        System.out.println(cp);
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
}

