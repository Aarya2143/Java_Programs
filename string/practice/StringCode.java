package string.practice;

public class StringCode {
    public static void main(String[] args) {
        /*
        String s1 = "java";
        s1.concat("tech");
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("java");
        sb.append("tech");
        System.out.println(sb);
        */
        String s1 = new String("world");
        String s2 = "world";
        String s3 = "world";
        StringBuffer sb1 = new StringBuffer("car");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(sb1)); // ------------------- This give always false
        System.out.println(s2==s3);
      //  System.out.println(s3==sb1);    --------------------// This senario cant possible
    }
}
