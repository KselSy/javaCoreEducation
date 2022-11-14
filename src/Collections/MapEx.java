package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Student, Integer> tm = new HashMap<>();
        Student st1 = new Student("Anton", 21);
        Student st3 = new Student("Stepan", 23);
        Student st4 = new Student("Liza", 20);
        Student st5 = new Student("Misha", 24);
        Student st6 = new Student("Oleg", 25);
        Student st2 = new Student("Sergey", 22);
        Student st7 = new Student("Sergey", 22);

        tm.put(st1, 5);
        tm.put(st2, 6);
        tm.put(st3, 2);
        tm.put(st4, 1);
        tm.put(st5, 3);
        tm.put(st6, 4);

        System.out.println(tm);

        tm.put(st7, 4);

        System.out.println(tm);


    }
}
class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
