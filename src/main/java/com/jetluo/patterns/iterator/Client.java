package com.jetluo.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:39
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        StudentAggregate aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("aa","001"));
        aggregate.addStudent(new Student("bb","002"));
        aggregate.addStudent(new Student("cc","003"));
        aggregate.addStudent(new Student("dd","004"));
        StudentIterator<Student> iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println(stu.getName() +"number:"+ stu.getNumber());
        }
        System.out.println("+++++标准输出++++++");
        List<Student> aggregate2 = new ArrayList<Student>();
        aggregate2.add(new Student("aa","001"));
        aggregate2.add(new Student("bb","002"));
        aggregate2.add(new Student("cc","003"));
        aggregate2.add(new Student("dd","004"));
        Iterator<Student> it = aggregate2.iterator();

        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.getName() +"number:"+ stu.getNumber());
        }

    }
}
