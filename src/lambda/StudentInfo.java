package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc){
        for(Student s: al){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 22, 'm', 5, 9.2);
        Student st2 = new Student("Anton", 18, 'm', 1, 7.3);
        Student st3 = new Student("Stepan", 20, 'm', 3, 4.4);
        Student st4 = new Student("Marina", 19, 'f', 2, 2.6);
        Student st5 = new Student("Olesya", 21, 'f', 4, 5.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Collections.sort(students, (s1, s2) -> s1.age-s2.age+s1.course-s2.course);
        System.out.println(students);
        System.out.println();

        StudentInfo info = new StudentInfo();
        info.printStudentOverGarde(students,5);
        System.out.println();
        info.printStudentUnderAge(students, 21);
        System.out.println();
        info.printStudentMixCondition(students,19,8,'m');
        System.out.println("-------------------------");
        info.testStudents(students, s -> s.avgGrade>5);
        System.out.println();
        info.testStudents(students, s -> s.age<21);
        System.out.println();
        info.testStudents(students, s -> s.age>19 && s.avgGrade<8 && s.sex == 'm');
    }
    void printStudentOverGarde(ArrayList<Student> al, double grade){
        for (Student s : al){
            if(s.avgGrade>grade)
                System.out.println(s);
        }
    }
    void printStudentUnderAge(ArrayList<Student> al, int age){
        for (Student s : al){
            if(s.age<age)
                System.out.println(s);
        }
    }
    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex){
        for (Student s : al){
            if(s.age>age && s.avgGrade<grade && s.sex == sex)
                System.out.println(s);
        }
    }
    interface StudentChecks{
        boolean check(Student s);
    }
}

