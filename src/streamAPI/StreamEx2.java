package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 22, 'm', 5, 9.2);
        Student st2 = new Student("Anton", 18, 'm', 1, 7.3);
        Student st3 = new Student("Stepan", 20, 'm', 3, 4.4);
        Student st4 = new Student("Marina", 19, 'f', 2, 2.6);
        Student st5 = new Student("Olesya", 21, 'f', 4, 5.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream().filter(element
                -> element.getAge()>19 && element.getAvgGrade()>5)
                .collect(Collectors.toList());

        System.out.println(students);

    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAvgGrade()==o.getAvgGrade())
            return 0;
        else if(this.getAvgGrade()<o.getAvgGrade()){
            return -1;
        }
        else
            return 1;
    }
}
