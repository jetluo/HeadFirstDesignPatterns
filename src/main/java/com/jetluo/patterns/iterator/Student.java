package com.jetluo.patterns.iterator;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName Student
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:15
 * @Version 1.0
 **/
public class Student {
    private String name;
    private String number;
    public Student(){

    }
    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("number", number)
                .toString();
    }
}
