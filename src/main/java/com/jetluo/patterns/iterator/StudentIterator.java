package com.jetluo.patterns.iterator;

/**
 * @ClassName StudentIterator
 * @Description TODO
 * @Author jet
 * @Date 2022/4/22 23:29
 * @Version 1.0
 **/
public interface StudentIterator<Student> {

    boolean hasNext();

    Student next();
}
