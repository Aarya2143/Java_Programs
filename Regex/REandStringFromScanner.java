package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REandStringFromScanner {

    public static void Test (String re, String str)
    {
        Pattern pattern = Pattern.compile(re);
        Matcher match = pattern.matcher(str);
        boolean matches = match.matches();
        System.out.println(matches);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pattern: ");
        String a = sc.nextLine();

        System.out.println("Enter your string: ");
        String b = sc.nextLine();

        REandStringFromScanner.Test(a,b);

    }
}
