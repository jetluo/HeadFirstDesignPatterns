package com.jetluo.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName StudentAggregateImpl
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:35
 * @Version 1.0
 **/
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }

}
