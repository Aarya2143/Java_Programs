package string;

public class ReverseString {

    public static void main(String[] args) {
        String s1 = "hello";
        for (int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }

       /* StringBuilder  b = new StringBuilder(s1);
        b.reverse();
        System.out.println(b);*/
    }

}
