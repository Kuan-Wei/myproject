package com.gary;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().Hello();
        Person p = new Person("Tom", 66.5f, 1.7f);
        p.Hello();
        System.out.println( p.bmi() );
    }
}
