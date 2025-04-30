package collection.comparable;

import java.util.*;

public class UsingSet implements Comparable<UsingSet>{
    private String name;
    private int age;

    public UsingSet(String name, int age) {
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
    public int compareTo(UsingSet o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "UsingSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Norml{
    public static void main(String[] args) {
        UsingSet set1 = new UsingSet("Aarya",23);
        UsingSet set2 = new UsingSet("Ved",2);
        UsingSet set3 = new UsingSet("Chan",45);
        UsingSet set4 = new UsingSet("Zen",90);
        UsingSet set5 = new UsingSet("Rakhi",50);

        List<UsingSet> s = new ArrayList<>();
        s.add(set1);
        s.add(set2);
        s.add(set3);
        s.add(set4);
        s.add(set5);

        System.out.println(s);
        Collections.sort(s);
        System.out.println("After sort");
        System.out.println(s);
    }
}
