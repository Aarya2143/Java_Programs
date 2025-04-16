package string.object_creation;

public class DoubleEqulastoOperator {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        String t1 = "java";
        String t2 = "java";

        System.out.println(s1 == s2); //false
        System.out.println(s1 == t1); //false
        System.out.println(s1 == t2); //fasle
        System.out.println(t1 == t2); //true
        System.out.println(s2 == t1); //false
        System.out.println(s2 == t2); //false
    }
}
