package string.string_method;

public class HashCode {
    String s;

    public HashCode(String s) {
        this.s = s;
    }

    public static void main(String[] args) {

        //String class hashcode method give hashcode based on character of string
        //String class overriden the object class hashcode method.

        String s1="java";
        String s2 ="java";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //Object class Hashcode method give hash code based on memory address of object

        HashCode obj1 = new HashCode("java");
        HashCode obj2 = new HashCode("java");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
