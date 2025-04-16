package assignment2;

import java.util.Scanner;

public class LargeInThreeUsingIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int i = scanner.nextInt();

        System.out.println("Enter num2: ");
        int j = scanner.nextInt();

        System.out.println("Enter num3: ");
        int k = scanner.nextInt();

        if(i>j && i>k){
            System.out.println("grater no is: "+i);
        }
        else if (j>i && j>k) {
            System.out.println("grater no is: "+j);
        }
        else {
            System.out.println("grater no is: "+k);
        }
    }
}
