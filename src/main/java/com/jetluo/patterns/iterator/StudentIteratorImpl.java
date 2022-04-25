package com.jetluo.patterns.iterator;

import java.util.List;

/**
 * @ClassName StudentIteratorImpl
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:30
 * @Version 1.0
 **/
public class StudentIteratorImpl implements  StudentIterator{
    private List<Student> list;

    private  int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
