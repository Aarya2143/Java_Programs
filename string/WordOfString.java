package string;

import java.util.Arrays;

public class WordOfString {
    public static void main(String[] args) {
        String s2 = "Java is a programming lang";
        String[] s3 = s2.split(" ");
        // System.out.println(s3.length);

        for(int i=0; i<s3.length; i++)
        {
            System.out.println(s3[i].length());
        }

    }
}
