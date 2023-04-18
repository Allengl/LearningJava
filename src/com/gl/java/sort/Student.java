package com.gl.java.sort;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        return o.score - this.score;
    }

    public static void main(String[] args) {
        Student[] students = new Student[6];
        // 不要按照顺序添加 Student
        students[0] = new Student("张三", 18, 100);
        students[1] = new Student("李四", 19, 87);
        students[2] = new Student("王五", 20, 95);
        students[3] = new Student("赵六", 21, 26);
        students[4] = new Student("孙七", 22, 57);
        students[5] = new Student("周八", 23, 121);




        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("After Sort");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
