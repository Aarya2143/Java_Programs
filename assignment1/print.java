package assignment1;

//-------------------------------------------------- 1 ----------------------------------------------
/*
public class MethodCall {
    void show(){
        System.out.println("First user define method");
    }

    void disp(){
        System.out.println("Second user define method");
    }

    public static void main(String[] args) {
        MethodCall m = new MethodCall();
        m.show();
    }
}
*/

//--------------------------------------------------- 3 ---------------------------------------------
/*
class ABC{
    void add(){
        System.out.println("addition");
    }
}
class XYZ {
    void add(){
        System.out.println("substract");
    }

    public static void main(String[] args) {
        XYZ a = new XYZ();
        a.add();
    }
}
*/
//------------------------------------------------ 4 ----------------------------------------
/*
class abc{
    public static void main(String[] args) {
        System.out.println("aarya");
    }
}
class xyz{
    public static void main(String[] args) {
        System.out.println("sanjay");
    }
}
class uix{
    public static void main(String[] args) {
        System.out.println("jadhav");
    }
}
*/

//-------------------------------------------------- 5 --------------------------------------------
/*
class abc{
    public static void main(String[] args) {
        System.out.println("Class A main method");
    }
}
class xyz{
    public static void main(String[] args) {
        System.out.println("Class B main method");
        abc.main(args);
    }
}
*/
// -------------------------------------------- 7 -----------------------------------------------
/*
class A
{
    public static void main(String []args)
    {
        System.out.println("A main");
        m1();
    }
    public static void m1()
    {
        System.out.println("A m1()");
        main(new String [0]);
    }
}
/*
Output
A main
A m1()
A main
A m1()
A main()
Error.
*/
//---------------------------------------------- 8 -----------------------------------------------
/*
public class Atf
{
    public static void main(String[]args)
    {
        System.out.println("A main string array");         <------- O/P
    }
    public static void main (String args)
    {
        System.out.println("A main only String");
    }
    public static void main(int []args)
    {
        System.out.println("A main int array");
    }
}

//----------------------------------------------  2.3 Operators  ------------------------------------------
/*
class operator{

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);
        System.out.println(x);               //Post Increment

        int y = 20;
        System.out.println(++y);             //Pre Increment
    }
}
*/
//--------------------------------------------- 1 ------------------------------
/*
public class Oper
{
    public static void main(String[]args)
    {
        System.out.println(10.0/0);
    }
}
/*
 */

//-------------------------------------------- 2 ------------------------------
//String concatenation Operator : '+'
/*
public class print
{
    public static void main(String[]args)
    {
        String s="Tdit";
        int b =10;
        int c= 20;
        int d= 30;
        System.out.println(s+b+c); //Tdit1020
        System.out.println(b+c+s); //30Tdit
        System.out.println(b+s+c+d); //10Tdit2030
    }
}
*/