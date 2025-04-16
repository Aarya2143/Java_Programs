package task;

public class StringThreeObjCreation {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode("java"));

        System.out.println(System.identityHashCode(s2));
    }
}
