package string;

public class Prac {
    public static void main(String[] args) {
        String s1 = new String("Nikhil");
        String s2 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
