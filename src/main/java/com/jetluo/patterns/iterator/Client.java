package com.jetluo.patterns.iterator;

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
        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
