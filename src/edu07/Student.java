package edu07;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        } else {
            return Integer.compare(this.age, o.age);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DemoStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Oksana", 28);
        students[1] = new Student("Oksana", 19);
        students[2] = new Student("Bogdan", 42);
        students[3] = new Student("Orest", 17);

//        Arrays.sort(students);
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        Arrays.sort(students, new AgeComparator());
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        Arrays.sort(students, new NameComparator());
//        for (Student student : students) {
//            System.out.println(student);
//        }
        Arrays.sort(students, (o1, o2) -> {
            if (o1.getAge() != o2.getAge())
                return Integer.compare(o1.getAge(), o2.getAge());
            else
                return o1.getName().compareTo(o2.getName());
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}