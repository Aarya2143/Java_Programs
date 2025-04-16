package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String s1 = scanner.nextLine();

        Pattern ptr = Pattern.compile("^[a-z_|.0-9]+\\@{1}gmail{1}\\.{1}com{1}$");
        Matcher match = ptr.matcher(s1);

        if(match.matches())
        {
            System.out.println("Valid mail");
        }
        else
        {
            System.out.println("Invalid mail");
        }
    }
}
