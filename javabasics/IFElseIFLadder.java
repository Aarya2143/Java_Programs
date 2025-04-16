package javabasics;

public class IFElseIFLadder {
    public static void main(String[] args) {
        int size = 49;
        if(size <= 28){
            System.out.println("Your size is extra small");
        } else if (size <= 32 ) {
            System.out.println("Size is small");
        } else if (size <= 36) {
            System.out.println("size is medium");
        } else if (size <= 40) {
            System.out.println("Size is large");
        } else if (size <=44) {
            System.out.println("size is extra large");
        } else if (size <= 48) {
            System.out.println("Size is extra extra large");
        } else {
            System.out.println("Size is not available");
        }
    }
}
 /*
    public static void main(String[] args) {
        int size = 40;

        if (size == 28) {
            System.out.println("your size is extra small");
        } else if (size == 28) {
            System.out.println("your size is small");
        } else if (size == 32) {
            System.out.println("your size is medium");
        } else if (size == 36) {
            System.out.println("your size is large");
        } else if (size == 40) {
            System.out.println("your size is Extralarge");
        } else if (size == 46) {
            System.out.println("your size is DOUBLE Extralarge");
        }
    }

 public static void main(String[] args) {
     int size = 100;

     if (size == 28) {
         System.out.println("your size is extra small");
     } else if (size == 28) {
         System.out.println("your size is small");
     } else if (size == 32) {
         System.out.println("your size is medium");
     } else if (size == 36) {
         System.out.println("your size is large");
     } else if (size == 40) {
         System.out.println("your size is Extralarge");
     } else if (size == 46) {
         System.out.println("your size is DOUBLE Extralarge");
     }
     else // Use of else statement is depend on us / not mendotary to use else
     {
         System.out.println("your size is not available in stock");
     }
     }


    }
  */