package string;

public class Swapping {
    public static void main(String[] args) {
        String s1 = "JAVA IS";
    //    String rev = "";
    //    String[] s2 = s1.split(" ");
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            s1 += s1.charAt(i);
        }
        s1 = s1.substring(s1.length()/2);
        System.out.println(s1);
    }
}
