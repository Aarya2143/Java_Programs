package javabasics;

// filename Main.java
/*
class Grandparent {
    public void Print()
    {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print()
    {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print()
    {
        // Trying to access Grandparent's Print()
        super.super.Print();
        System.out.println("Child's Print()");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.Print();
    }
}

 */
// filename Main.java
class Grandparent {
    public void Print()
    {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print()
    {
        super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print()
    {
        // Trying to access Grandparent's Print()
        super.Print();
        System.out.println("Child's Print()");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.Print();
    }
}
