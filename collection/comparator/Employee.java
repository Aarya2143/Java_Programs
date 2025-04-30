package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private double salary;
    private String name;
    private int age;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Employee1 implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class Normal {
    public static void main(String[] args) {
        Employee emp = new Employee("Arman", 22, 3000);
        Employee emp1 = new Employee("Kiran", 32, 1000);
        Employee emp2 = new Employee("Bhumi", 54, 6000);
        Employee emp3 = new Employee("Vanshika", 44, 3200);
        Employee emp4 = new Employee("Chitra", 67, 4000);

        List<Employee> e = new ArrayList<>();
        e.add(emp);
        e.add(emp1);
        e.add(emp2);
        e.add(emp3);
        e.add(emp4);

        Employee1 empl = new Employee1();

        System.out.println(e);
        Collections.sort(e,empl);
        System.out.println("compare by name");
        System.out.println(e);

        Comparator<Employee> byage = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        System.out.println("Compare by age");

        Collections.sort(e,byage);
        System.out.println(e);
    }
}

