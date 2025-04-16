package static_block;

public class SaticBlockWritingAndCalling {

static int a=6;

/* RULES OF STATIC BLOCK
    // Static Block Does not have  a return type as wll as name
    //Use - Static method always execute first than main method
    //If multiple static block present in same class the it go from top to bottom execution
*/
    static
    {
        System.out.println("Static Block writing like this without return type and name"+a);

    }

    public static void main(String[] args) {
        {
            System.out.println("Static block execute first before main method");
        }
    }
}
