package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        int [] arr = {3,5,12,6,13,7,23,1,24,18,54,765,2,43,123,9};
        arr = Arrays.stream(arr).filter(e->e%2==1).
                map(e->{if (e%3==0){e=e/3;}return e+10;}).sorted().toArray();
        System.out.println(Arrays.toString(arr));

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

        students.stream().map(e->
        {e.setName(e.getName().toUpperCase());return e;})
                .filter(e->e.getSex()=='m')
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }
}
