package string.string_method;

//The Java intern() method is used to create an exact copy of a String that is present in the heap memory
// and stores it in the String constant pool.

public class InternMethod {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = new String("java");
        String s5 = "Java";
        String s6 = new String("java");

        String s3 = s1.intern();
        String s4 = s2.intern();
        String s7 = s5.intern();
        String s8 = s6.intern();

        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s6==s7);
        System.out.println(s3==s4);
        System.out.println(s6==s8);
    }
}
