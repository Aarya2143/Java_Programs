package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterFind {

    public static void main(String[] args) {
        int count=0;
        Pattern pattern = Pattern.compile("A-Z");
        Matcher match = pattern.matcher("A-ZaryasanjA-ZyA-Zdhav");

        while (match.find())
        {
           count++;
           System.out.println("At start index: "+match.start()+"  till end index: "+match.end());
        }
        System.out.println("No of capital letter is: "+count);
    }
}
