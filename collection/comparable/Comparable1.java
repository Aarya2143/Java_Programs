package collection.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1> {
    private String name;
    private int age;
    private String address;
    private double salary;

    public Comparable1(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Comparable1 o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "Comparable1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

}

class Employee{


    public static void main(String[] args) {
        Comparable1 emp = new Comparable1("adit",22,"shivajinagar",3000);
        Comparable1 emp1 = new Comparable1("vinit",25,"up",6000);
        Comparable1 emp2= new Comparable1("raj",27,"satara",9000);
        Comparable1 emp3 = new Comparable1("shital",32,"nahik",4000);
        Comparable1 emp4 = new Comparable1("aarya",23,"nagar",1000);

        List<Comparable1> em = new LinkedList<>();
        em.add(emp);
        em.add(emp1);
        em.add(emp2);
        em.add(emp3);
        em.add(emp4);

        System.out.println(em);
        Collections.sort(em);
        System.out.println("After sort");
        System.out.println(em);

    }
}

