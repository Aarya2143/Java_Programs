package assignment2;

import java.util.Scanner;

public class EvenOddUsingModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        int i = scanner.nextInt();

        if((i %2 ==0))
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
