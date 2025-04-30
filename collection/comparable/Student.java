package collection.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int rollno;
    private  char div;

    public Student(String name, int rollno, char div) {
        this.name = name;
        this.rollno = rollno;
        this.div = div;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", div=" + div +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("akki",1,'A');
        Student st2 = new Student("priya",2,'C');
        Student st3 = new Student("vishu",3,'D');
        Student st4 = new Student("kirti",4,'B');

        List<Student> std = new LinkedList<>();
        std.add(st1);
        std.add(st2);
        std.add(st3);
        std.add(st4);

        System.out.println(std);
        Collections.sort(std);
        System.out.println("After sort");
        System.out.println(std);
    }

}