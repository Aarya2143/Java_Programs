package veriables;
//------------------------------------------- 1 ------------------------------------------
/*
public class AllVeriableCallinSameClass {

    int instasvar = 22;     //default  value given by Constructor

    static int b = 12;     //default  value given by JVM

    void show(){
        int k = 2;
        System.out.println(k);
    }

    public static void main(String[] args) {
       AllVeriableCallinSameClass v = new AllVeriableCallinSameClass();
       System.out.println(v.instasvar);
       System.out.println(AllVeriableCallinSameClass.b);
       v.show();
    }
}
*/

// -------------------------------------------- 2 ------------------------------------
/*

class VarCalling{

    int a = 10;

    static int c = 5;

    void show(){
      int y = 12;
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println(VarCalling.c);
        VarCalling v = new VarCalling();
        System.out.println(v.a);
        v.show();
    }
}

*/
//------------------------------------------------ 3 -----------------------------------------
/*
class Abc{
    int a;

    static int c ;

    void display(){
        int d = 12 ;
        System.out.println(d);
    }

    public static void main(String[] args) {
        System.out.println(Abc.c);
        Abc obj = new Abc();
        System.out.println(obj.a);
        obj.display();

    }
}
*/

//----------------------------------- 4 ------------------------------
/*
class XYZ{
    int a  = 25;

    static int b = 56;

    void print(){
        int d = 12;
        System.out.println(d);
    }

    public static void main(String[] args) {
        System.out.println(XYZ.b);

        XYZ obj = new XYZ();
        System.out.println(obj.a);
        obj.print();

    }
}
*/