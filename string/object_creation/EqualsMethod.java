package string.object_creation;

//.equals() method in string is use to compare content present in two strings
//ex. java is a content

public class EqualsMethod {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("Java");

        String t1 = "java";
        String t2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(t1)); //true
        System.out.println(s1.equals(t2)); //true
        System.out.println(t1.equals(t2)); //true
        System.out.println(s2.equals(t1)); //false
        System.out.println(s2.equals(t2)); //false
    }

}
