package string.string_method;

public class TrimMethod {
    public static void main(String[] args) {
        String s = " Java Program ";
        System.out.println("trim ords: "+s.trim()+" , " +"length of: " + s.length());   //14
        String k = s.trim();
        System.out.println("length of trim: "+k.length());                              //12
    }
}
