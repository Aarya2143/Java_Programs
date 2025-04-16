package array;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        //output
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] == x)
            {
                System.out.println("x found at index: "+i);
            }
        }

    }
}
