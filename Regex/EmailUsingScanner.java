package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: ");
        String str = sc.nextLine();

        String pattern = "\\b[\\w.-]+@[\\w.-]+\\.\\w+\\b";

        Pattern ptr = Pattern.compile(pattern);
        Matcher match = ptr.matcher(str);

        boolean found = false;
        while (match.find()){
            System.out.println("find match: "+match);
            found = true;
        }

        if(!found){
            System.out.println("PLEASE ENTER VALID EMAIL");
        }
    }
}
