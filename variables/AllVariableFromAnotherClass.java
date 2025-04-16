package veriables;
// -------------------------------- 1 -----------------------------
/*
public class AllVariableFromAnotherClass {
    int a = 12;

    static int d = 65;

    void show(){
        int d = 6;
        System.out.println(d);
    }
}

class AnotherClass extends AllVariableFromAnotherClass{
     int k = 54;

     static int f =9;

     void add(){
         int h = 8;
         System.out.println(h);
     }

    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        System.out.println(obj.a);
        System.out.println(obj.k);

        System.out.println(AnotherClass.f);
        System.out.println(AnotherClass.d);

        obj.add();
        obj.show();
    }
}
*/
//------------------------------- 2 ----------------------------
/*
class Variable{
    int a = 6;
    static int b = 5;
    void show(){
        int c = 9;
        System.out.println(c);
    }
}
class Var extends Variable{
    int d = 58;
    static int l = 865;
    void pace(){
        int f = 5;
        System.out.println(f);
    }

    public static void main(String[] args) {
        Var v = new Var();
        System.out.println(v.a);
        System.out.println(v.d);

        System.out.println(Var.l);
        System.out.println(Var.b);

        v.pace();
        v.show();
    }
}
*/

//------------------------------------- 3 ------------------------
/*
class firlance{
    int a = 8;

    static int j = 69;

    void sow(){
        int f = 33;
        System.out.println(f);
    }
}
class higd extends firlance{
    int d = 8;

    static int f = 6;

    void full(){
        int j = 85;
        System.out.println(j);
    }

    public static void main(String[] args) {
        higd obj = new higd();
        System.out.println(obj.d);  // Instance childclass
        System.out.println(obj.a);  //  Instance parentclass

        System.out.println(higd.f);  // Non Instance childclass
        System.out.println(higd.j);  // Non Instance parentclass

        obj.full(); // Local childclass
        obj.sow();  // Local parentclass
    }
}
*/