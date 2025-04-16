package string;

public class CompareTo_MethodTask {
            public static void main(String[] args) {
                String s1= "Java";
                String s2 = "java";
                String s3 = "Java";
                String s4 = "Javaa";
                String s5 = "Javak";//two string length difference -->4-5=-1

                System.out.println(s1.compareTo(s2));
                System.out.println(s1.compareTo(s3));
                System.out.println(s1.compareTo(s4));
                System.out.println(s1.compareTo(s5));
                System.out.println(s4.compareTo(s5));
            }
        }