package javabasics;

public class Methodsyntax
{
    //--------------------------------------------------- 1st syntax example -----------------------------------------------
   /*
   void show()
    {
        System.out.println("hii");
    }
    void view()
    {
        System.out.println("addition of 2 no is:");
    }
    public static void main(String[] args) {
        Methodsyntax m = new Methodsyntax();
        m.show();
        m.view();
    }
 */

    // syntax 2: ------------------------------------------ 2nd syntax example -------------------------------------------
    /*
    void add(int a, int b){
        System.out.println("hello total sum is:"+ (a+b));
    }
        void sub(int a, int b){
            System.out.println("sub of two no:"+ (a-b));
    }
    public static void main(String[] args) {
        Methodsyntax m = new Methodsyntax();
        m.sub(50,10);
        m.add(60,30);
    }
 */
    // syntax 3: ---------------------------------------3rd syntax example ------------------------------------------------
    /*
    int add(){
        System.out.println("addition of two no:");
        int c = 55+50;
        System.out.println(c);
        return c;
    }
    int sub()
    {
        System.out.println("sub of no:");
        int c = 44 - 12;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        Methodsyntax m = new Methodsyntax();
        m.sub();
    }
*/
    //  syntax 4:------------------------------------ 4th syntax example ---------------------------------------
/*
    int add(int a, int b)
    {
        //optional line : System.out.println("add three no:");
        int c = a + b;
        System.out.println("add of no is :"+ c);
        return (c);
    }
    public static void main(String[] args) {
        Methodsyntax m = new Methodsyntax();
        m.add(50,50);
    }
*/
    }
