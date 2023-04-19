package com.yqy.day12;

/**
 * 自定义泛型类的使用
 * 自定义方法的使用
 */
public class Demo6 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.update("蔡徐坤");
        list.delete("蔡徐坤");

        show("kunkun");
        show(98);
        show(2.0);
    }

    public static <T> void show(T t) {
        System.out.println(t);
    }
}


class MyArrayList<E>{
    public void update(E e){
        System.out.println("update" + e);
    }

    public void delete(E e){
        System.out.println("delete" + e);
    }
}
