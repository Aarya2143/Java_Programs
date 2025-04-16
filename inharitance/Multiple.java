package inharitance;
/*
interface abc{
    default void add(){
        int a = 12+2;
    }
}
interface xyz {
    default void add(){
        int a = 55-45;
    }
}
class result implements abc, xyz
{
    @Override
    public void add()
    {
        abc.super.add();
        int a= 12+5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        result obj = new result();
        obj.add();

    }
}
*/

// ------------------------------------------ INHERITANCE ACHIVE USING INTERFACE KEYWORD -----------------------------
/*
interface pi1{
    void show();
}
interface pi2{
    void show();
}

class test implements pi1,pi2{

        // Declared new Method
         void showofpi1() {
             System.out.println("ho");
        }

        // Declared new Method
        void showofpi2() {
            System.out.println("hi");
        }

    public static void main(String[] args) {
        test d = new test();

        d.showofpi1();
        d.showofpi2();

    }

    @Override
    public void show() {

    }
}
*/

/* ----------------------------------------------- DONT SUPPORT MULTIPLE INHERITANCE -------------------------------
public class MultipleInheritance {
    class A{
        void fun(){
            System.out.println("parent1");
        }
    }
    class B {
        void joy(){
            System.out.println("perent2");
        }
    }
    class C extends A,B
    {
        void happy(){
            System.out.println("child");
        }

        public static void main(String[] args) {
            C obj = new C;
        }
    }
}
*/



