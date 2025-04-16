package Regex;

public class CountCharacterClassMethods {
    public static void main(String[] args) {
        String s1 = "Aarya@123";
        int digit = 0;
        int alpha = 0;
        int splChar = 0;

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if(Character.isDigit(ch)){
                digit++;
            } else if (Character.isAlphabetic(ch)) {
                alpha++;
            } else {
                splChar++;
            }
        }
        System.out.println("Total Digit in String is: "+digit);
        System.out.println("Total alpha in String is: "+alpha);
        System.out.println("Total Specialchar in String is : "+splChar);
    }
}
