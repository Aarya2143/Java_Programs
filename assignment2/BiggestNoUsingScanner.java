package assignment2;

import java.util.Scanner;

public class BiggestNoUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: "+ System.in);
        int i = scanner.nextInt();

        if(i < 10){
            System.out.println("value is less than 10");
        }
        else{
            System.out.println("value is greater than 10");
        }
    }
}
