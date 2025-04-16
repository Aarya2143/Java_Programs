package assignment2;

import java.util.Scanner;

public class EvenOddAsendDesc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First numbers: ");
        int start = sc.nextInt();

        System.out.println("Enter Second number: ");
        int end = sc.nextInt();

        System.out.println("No start from "+start+" End with "+end);

        if(start<end)
        {
            if(start %2 !=0 )
            {
                start++;
            }
            for (int i=start; i<=end; i+=2)
            {
                System.out.println(i+" ");
            }
        }
        else {
            if(start %2 !=0)
            {
                start--;
            }
            for (int i=start; i>=end; i-=2)
            {
                System.out.println(i+" ");
            }
        }
       // sc.close();
    }
}
class Operators{
    public static void main(String[] ar)
    {
        int a = 12;
        int b = 12;
        System.out.println("Sum of No: "+a+b);
    }
}