package constructor;
/*
class did{
    int a ;
    float b;
    int c;
    String d;

    did(){
        this.a = a;
        this.b= b;
        this.c= c;
        this.d=d;
    }

    public static void main(String[] args) {
        did aarya = new did();
        System.out.println("age: "+125+"no: "+5.3+"int no: "+6+"name: "+"aarya");

        did kirti = new did();
        System.out.println("age: "+25+"no: "+3.3+"int no: "+9+"name: "+"kirti");
    }
}

 */
// ------------------------------------------ 5 -------------------------------------------
/*
class abc{
    abc(){
        int a = 12;
        int b = 12;
        int c = a+b;
        System.out.println(c);
    }
}
class xyz extends abc {
    xyz(){
        int a = 56;
        int b = 56;
        int c = a -b;
        System.out.println(c);
    }
}
class uix extends abc
{
    uix(){
        int d = 24;
        int e = 1;
        int k = d*e;
        System.out.println(k);
    }
}
class kpy extends xyz{
    kpy(){
        int b = 5;
        int l = 5;
        int f = b/l;
        System.out.println(f);
    }

    public static void main(String[] args) {
        kpy obj = new kpy();
    }
}*/
//---------------------------------------------------- 4 ----------------------------------------
/*
class aarya{
    aarya(){
        System.out.println("aarya");
    }
}
class sanjay extends aarya{
    sanjay(){
        System.out.println("sanjay");
    }
}
class jadhav extends aarya {
    jadhav() {
        System.out.println("jadhav");
    }
}
class revati extends jadhav{
    revati(){
        System.out.println("revati");
    }

    public static void main(String[] args) {
        revati r = new revati();
    }
}
*/
/* -------------------------------------------------- 3 -------------------------------------
class grandparent{
    grandparent(){
        System.out.println("Grandparent class");
    }
}
class parent extends grandparent{
    parent(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    child(){
        System.out.println("child class");
    }

    public static void main(String[] args) {
        child c = new child();
    }
}
*/
//------------------------------------------- 2 ----------------------------------------
/*
class addition{
    addition(){
        System.out.println("add");
    }
}
class sub extends addition {
    sub(){
        System.out.println("substract");
    }

    public static void main(String[] args) {
        sub s = new sub();
    }
}
*/
// ---------------------------------------------- 1 ---------------------------------------
/*
public class UsingInheritance {

    UsingInheritance(){
        System.out.println("ABC");
    }
}
class nun extends UsingInheritance
{
    nun() {
        // super(); --------------------------------------------- this line provided by jvm
        System.out.println("xyz");
    }

    public static void main(String[] args) {
        nun ui = new nun();
    }
}
*/