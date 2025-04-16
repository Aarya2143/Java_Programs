package assignment2;

import java.util.Scanner;

public class EqualToOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No 1: ");
        int i = scanner.nextInt();
        System.out.println("Enter No 2: ");
        int j = scanner.nextInt();

        if(i == j)
        {
            System.out.println("Both number are equal");
        }
        else {
            System.out.println("Both Numbers are Different");
        }
    }
}

