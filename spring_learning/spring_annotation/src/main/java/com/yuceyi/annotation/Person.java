package com.yuceyi.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private int pid;
    private String pname;
    private String psex;

    @Resource
    private Student student;

    public void showStudent(){
        this.student.descStudent();
    }

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPsex() {
        return psex;
    }
    public void setPsex(String psex) {
        this.psex = psex;
    }
}
