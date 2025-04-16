package inharitance;
//----------------------------------------------( SINGLE LEVEL INHERITANCE CODE) 9 -------------------------------------
/*
public class Ie{
    void case1(){
        System.out.println("seed");
    }
}
class lc extends Ie{
    void case2(){
        System.out.println("leaf");
    }

    public static void main(String[] args) {
        lc h = new lc();
        h.case1();
    }
}
*/
//--------------------------------------------------------- 8 ---------------------------------------------------------
/*
class test1 {
    int a = 12;
    void show(){
        System.out.println("testing code");
    }
}
class test2 extends test1{
    void disp(){
        System.out.println("tested");
    }

    public static void main(String[] args) {
       test2 t = new test2();
       t.show();
    }
}
*/
//------------------------------------------------------------- 7 --------------------------------------------------
/*
class Classroom {
    void smaller()
    {
        int a = 12;
        int b = 24;
        boolean c = a<b;
        System.out.println("large no is b:" + c);
    }
}
class student extends Classroom
{
    void bigger(){
        int a = 12;
        int b = 24;
        boolean c =  a >  b;
        System.out.println("smaller no is f:" + c);
    }

    public static void main(String[] args) {
        student s = new student();
        s.bigger();
        s.smaller();
    }
}
*/
// -------------------------------------------------------- 6 -------------------------------------------------
/*
class call1
{
    void test1()
    {
        System.out.println("ABC");
    }
}
class call2 extends call1
{
    void test2()
    {
        System.out.println("xyz");
    }

    public static void main(String[] args) {
        call2 c = new call2();
        c.test1();
        c.test2();
    }
}
*/
//---------------------------------------------------------- 5 -----------------------------------------------
/*
class BigNO{

       void test()
       {
            System.out.println("bigger no is a");
       }
}
class SmallNO extends BigNO{
    void show()
    {
        System.out.println("smaller no is");
    }

    public static void main(String[] args) {
       SmallNO s = new SmallNO();
       s.show();
       s.test();
    }
}
*/
//-------------------------------------------------------- 4 -----------------------------------------------------
/*
class Multiply
{
    void mul(int a, int b)
    {
        int c = a  * b;
        System.out.println("multiplication of two no:"+c);
    }
}
class division extends Multiply
{
    void div(int a, int b)
    {
        int c = a / b;
        System.out.println("division of two no is:"+c);
    }

    public static void main(String[] args)
    {
        division m = new division();
        m.mul(2,5);
        m.div(12,2);
    }
}
*/
//-------------------------------------------------------------- 3 ------------------------------------------------
/*
class AddNumber{
    void add(int a, int b)
    {
        int c = a + b;
        System.out.println("addition of two number is:" +c);
    }
}
class SubNumer extends AddNumber
{
    void substraction(int a, int b)
    {
        int c = a-b;
        System.out.println("substraction of two no is: ");

    }

    public static void main(String[] args) {
        SubNumer obj = new SubNumer();
        obj.add(25,25);
        obj.substraction(43,42);
    }
}
*/
//-------------------------------------------------------------- 2 ------------------------------------------------
/*
 class BasicInharitance
{
    void Animal()
    {
        System.out.println("Animal is parent class");
    }

}
class Dog extends BasicInharitance
    {
        void Dog()
        {
            System.out.println("Dog is a child class");
        }

        public static void main(String[] args) {
            //BasicInharitance obj = new BasicInharitance();
            Dog abc = new Dog();
            abc.Animal();
        }
    }
*/
//-------------------------------------------------------------- 1 ------------------------------------------------
/*
class parent extends child
{
    void property(){
        System.out.println("parents property");
    }

    public static void main(String[] args) {
        parent p = new parent();
        p.nonproperty();
    }
}
class child
{
    void nonproperty()
    {
        System.out.println("childs peoperty");
    }
}
*/
//-------------------------------------------------------------------------------------------------------------

