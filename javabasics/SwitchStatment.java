package javabasics;

public class SwitchStatment {
 /*
    public static void main(String[] args) {

        int size = 36;
        switch (size) {
            case 28:
                System.out.println("size is small");
                break;
            case 32:
                System.out.println("size is medium");
                break;
            case 34:
                System.out.println("size is large");
                break;
            case 36:
                System.out.println("size is large");
                break;
            case 40:
                System.out.println("size is extra large");
                break;
            case 42:
                System.out.println("size is extra extra large");
                break;
            default:
                System.out.println("size is not present");

        }
    }
*/

    public static void main(String[] args) {
        String i = "kiwi";
        switch (i){
            case "apple" :
                System.out.println("string is not java prog its apple");
                break;
            case "banana":
                System.out.println("string is not java prog its banana");
                break;
            case "kiwi":
                System.out.println("string is not java prog its kiwi");
                break;
            case"java program":
                System.out.println("string is java prog its right");
                break;
            case "array":
                System.out.println("string is not java prog its array");
                break;
            default:
                System.out.println("string is incorrect its default");

        }
    }
}
