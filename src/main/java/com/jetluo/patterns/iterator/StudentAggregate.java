package com.jetluo.patterns.iterator;

/**
 * @ClassName StudentAggregate
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:34
 * @Version 1.0
 **/
public interface StudentAggregate {
    void addStudent(Student stu);
    void removeStudent(Student stu);
    StudentIterator getStudentIterator();
}
