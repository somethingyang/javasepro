package com.yqy.day12;

import com.yqy.day8.Teacher;

/**
 *泛型接口的使用
 */
public class Demo5 implements Data<Teacher>{

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void del(int i) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void query(String s) {

    }
}


/**
 * 泛型接口Data
 * @param <E>
 */
interface Data<E> {
    void add(E e);
    void del(int i);
    void update(E e);
    void query(String s);

}
