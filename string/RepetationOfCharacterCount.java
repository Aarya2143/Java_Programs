package string;

  //  take input from user and caluculate repetation of character count  //

import java.util.Scanner;

public class RepetationOfCharacterCount {
    class A
    {
        public static void main(String[] args) {

            Scanner A = new Scanner(System.in);
            System.out.println("Enter the String ");
            String s1 =A.nextLine();

            int[] count = new int[256];

            for(int i = 0;i<s1.length();i++)
            {
                count[s1.charAt(i)]++;
            }
            for(int i =0 ;i<256;i++)
            {
                if(count[i]>0){
                    System.out.println("Total each char in String "+(char)i+" = "+count[i]);
                }
            }
        }
    }
}




