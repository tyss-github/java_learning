package com.yuceyi.app;
/**
 * Spring 容器的生命周期
 * @author hadoop
 *
 */
public class SpringLifeCycle {
    public SpringLifeCycle(){
        System.out.println("SpringLifeCycle");
    }
    //定义初始化方法
    public void init(){
        System.out.println("init...");
    }
    //定义销毁方法
    public void destroy(){
        System.out.println("destroy...");
    }
     
    public void sayHello(){
        System.out.println("say Hello...");
    }
}
