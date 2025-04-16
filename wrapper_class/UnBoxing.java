package wrapper_class;

public class UnBoxing {

    //Automatic conversion of a wrapper class object into its corresponding primitive type.

    public static void main(String[] args) {
        Integer obj = 20;            // Wrapper class object
        int num = obj;               //Unboxing (Integer → int)
        System.out.println(obj);
        System.out.println(num);
    }
}
