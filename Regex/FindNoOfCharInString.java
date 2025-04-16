package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNoOfCharInString {
    public static void main(String[] args) {

        int count = 0;
        Pattern ptr = Pattern.compile("[a-zA-Z0-9@!#$%^&*_+\\-=]+");
        Matcher mat = ptr.matcher(" Aarya1 Sanjay@ Jadhav ");

       while (mat.find()){
           count++;
           System.out.println("start from index: "+mat.start()+" end with index:"+mat.end());
       }
        System.out.println("No of words present in string: "+count);
    }
}
