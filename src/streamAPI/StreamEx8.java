package streamAPI;


import java.util.ArrayList;
import java.util.List;

public class StreamEx8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 22, 'm', 5, 9.2);
        Student st2 = new Student("Anton", 18, 'm', 1, 7.3);
        Student st3 = new Student("Stepan", 20, 'm', 3, 4.4);
        Student st4 = new Student("Marina", 19, 'f', 2, 2.6);
        Student st5 = new Student("Olesya", 21, 'f', 4, 5.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e->System.out.println(e.getName()));
    }
}
class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsOnFaculty.add(st);
    }
}
