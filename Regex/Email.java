package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String str = "aarya_jadhav@moderncoe.edu.in";
        String pattern = "\\b[\\w.-]+@[\\w.-]+\\.\\w+\\b";

        Pattern regex = Pattern.compile(pattern);
        Matcher matche = regex.matcher(str);

        while (matche.find())
        {
            System.out.println("Find Match: "+matche.group());
        }
    }
}
