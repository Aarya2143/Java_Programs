package string;

public class Task {
    public static void main(String[] args)
    {
        String s1 = new String("Java");
        String s2 = "Java";
        StringBuffer s3 = new StringBuffer("Java");
        StringBuilder s4 = new StringBuilder("Java");

        //compare using .equals method
        System.out.println(s1.equals(s2)); //True
        System.out.println(s1.equals(s3)); //False
        System.out.println(s1.equals(s4)); //False

        // compare using == operator
        System.out.println(s1==s2); //false
        System.out.println(s1== s3.toString()); //false
        System.out.println(s1== s4.toString()); //false
        System.out.println(s2== s3.toString()); //false


    }
}
