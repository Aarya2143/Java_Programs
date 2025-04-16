package assignment2;

import java.util.Scanner;

public class EvenOddUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if((num & 1) ==0 )
        {
            System.out.println("Number is even: "+num);
        }
        else {
            System.out.println("Number is odd: "+num);
        }
    }
}
