package string;
import java.util.Scanner;
public class AddSpaceUsingScanner {


    class replace{
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter The String: ");
            String s1 = s.nextLine();

            System.out.println(s1.replace(""," "));
        }
    }
}
