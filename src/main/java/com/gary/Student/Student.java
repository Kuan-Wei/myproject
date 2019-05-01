package com.gary.Student;

public class Student {
    String name;
    String id;
    int math;
    int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.println(name + "\t" + math + "\t" + english
         + "\t" + (english + math )/2 );
    }
}
