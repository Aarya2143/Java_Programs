package object_class_method;

public class EqualsOverload {
    String name;
    int age;

    EqualsOverload(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Equals e1 = new Equals("aarya",22);
        Equals e2 = new Equals("Shraddha",19);
        Equals e3 = new Equals("aarya",22);
        Equals e4 = e1;
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
    }
}
