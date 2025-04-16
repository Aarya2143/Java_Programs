package wrapper_class;

public class AutoBoxing {

    // Automatic conversion of a primitive type into its corresponding wrapper class.

    public static void main(String[] args) {
        int num = 20;
        Integer obj = num;
        System.out.println(num);    //int=20
        System.out.println(obj);    //AutoBoxing ( int ---> Integer )
    }
}
