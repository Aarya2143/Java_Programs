package assignment2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loop: ");
        int i = scanner.nextInt();
       do {
           System.out.println("im in do");
       }
       while (i == 5);
    }
}
