package com.easy.day3;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    //实现Comparator接口，重写compare方法。第一个参数减第二个参数，升序；第二个参数减第一个参数，降序
    //比较器的好处就是可以自定义排序规则
    public static class IdAscendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }

    }

    public static class IdDescendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }

    }

    public static class AgeAscendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }

    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("A", 2, 23);
        Student student2 = new Student("B", 3, 21);
        Student student3 = new Student("C", 1, 22);

        Student[] students = new Student[]{student1, student2, student3};

        Arrays.sort(students, new IdAscendingComparator());
        printStudents(students);
        System.out.println("===========================");
    }
}
