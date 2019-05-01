package com.gary.Student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.print("Please enter student's name : ");
        Scanner scanner = new Scanner( System.in );
        String name = scanner.next();
        System.out.print("Please enter student's English score : ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math score : ");
        int math = scanner.nextInt();
        Student stu = new Student(name, math, english);
        stu.print();
    }
}
