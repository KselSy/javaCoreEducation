package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(43,"Anton",59000);
        Employee emp2 = new Employee(36,"Sergey",89042);
        Employee emp3 = new Employee(128,"Stepan",456056);
        Employee emp4 = new Employee(10,"Kolya",12380);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        employeeList.sort((e1,e2)->e1.id-e2.id);
        System.out.println(employeeList);

    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
