package exception.TryWithResource;

import java.util.Scanner;

public class ScannerClosing implements AutoCloseable
{
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        sc.nextLine();*/

        try (Scanner sc = new Scanner(System.in))
        {
            int c = 10/0;
        } catch (Exception e) {
            System.out.println("catch");
        }
    }

    @Override
    public void close() throws Exception {

    }
}
