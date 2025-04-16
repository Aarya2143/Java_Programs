package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone no: ");
        String Number = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\+91[0-9]{10}$");
        Matcher match = pattern.matcher(Number);

        if(match.matches()){
            System.out.println("It is valid phone no");
        }
        else {
            System.out.println("Please Enter valid number");
        }
    }
}
