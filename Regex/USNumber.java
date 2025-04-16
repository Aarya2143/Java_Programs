package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your No: ");
        String str = scanner.nextLine();

        Pattern ptr = Pattern.compile("^\\+1{1}[0-9]{3}-[0-9]{3}-[0-9]{3}$");
        Matcher mat = ptr.matcher(str);

        if(mat.matches()){
            System.out.println("Number is valid");
        }
        else {
            System.out.println("Enter valid No");
        }
    }
}
