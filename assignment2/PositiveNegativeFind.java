package assignment2;

import java.util.Scanner;

public class PositiveNegativeFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int i = scanner.nextInt();

        if(i < 0)
        {
            System.out.println("Number is negative: "+ i);
        }
        else{
            System.out.println("Number is positive: "+i);
        }
    }
}
