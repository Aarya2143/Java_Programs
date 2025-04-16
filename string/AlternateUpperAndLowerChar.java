package string;

public class AlternateUpperAndLowerChar {
    public static void main(String[] args) {
        String s="learnjava";

        String d = "";

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(i%2==0){
                d=d+Character.toUpperCase(c);
            }
            else{
                d=d+Character.toLowerCase(c);
            }
        }
        System.out.println(d);
    }
}
