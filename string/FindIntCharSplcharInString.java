package string;

public class FindIntCharSplcharInString {
    public static void main(String[] args) {
        String s1 = "AaryaSanjayJadhav@#123";
        int digit = 0;
        int alpha = 0;
        int splchar = 0;

        for (int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(ch>='1' && ch<='9')
            {
                digit++;
            }
            else if (ch>= 65 && ch<=90 || ch>= 97 && ch<=122) {
                alpha++;
            }
            else {
                splchar++;
            }
        }
        System.out.println("Total Digit in String is: "+digit);
        System.out.println("Total Characters in String is: "+ alpha);
        System.out.println("Total Specialchar in String is : "+splchar);
    }
}
