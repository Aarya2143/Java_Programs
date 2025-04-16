package string.buffer;

public class Append {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java ");
        StringBuffer sb2 = new StringBuffer("programming ");

        System.out.println(sb1.append("technology"));
        System.out.println(sb2.append("language"));
    }
}
