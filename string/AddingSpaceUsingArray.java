package string;
import java.util.Scanner;
public class AddingSpaceUsingArray {

        public static void main(String[] args) {
            Scanner A = new Scanner(System.in);
            System.out.println("Enter the String : ");
            String s1 =A.nextLine();

            char arr [] = s1.toCharArray();
            for(int i=0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

