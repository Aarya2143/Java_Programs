package constructor;
/*
class A{
    A(){
        System.out.println("No Arg Class A");
    }
    A(int a){
        this();
        System.out.println("Arg Class A");
    }
}
class B extends A
{
    B(){
        super(5);
        System.out.println("No Arg Class B");
    }
    B(int a, String g){
        this();
        System.out.println("2 Arg Class B");
    }
}
class C extends B
{
    C(int a, boolean b){
        super(12,"Sanjay");
    System.out.println("2 Arg Class C");
}
    C(int a, String s, float f){
        this(12,true);
    System.out.println("3 Arg Class C");
}

    public static void main(String[] args) {
        C obj = new C(12,"Aarya",5.5f);
    }
}
*/

// ----------------------------------------------------- d-c-b-a -------------------------------------------
/*

class Test1 extends Test2{
    Test1(){
        this(12,58);
        System.out.println("a");
    }
    Test1(int a, int b){
        super();
        System.out.println("b");
    }
}
class Test2 {
    Test2(){
        this(25,58);
        System.out.println("c");
    }
    Test2(int a, int b){

        System.out.println("d");
    }

    public static void main(String[] args)
    {
        Test1 c = new Test1();
    }
}
*/
//--------------------------------------------- no - arg - no - arg (a-b-c-d)------------------------------
/*
class Test1{
    Test1(){
        System.out.println("a");
    }
    Test1(int a, int b){
        this();
        System.out.println("b");
    }
}
class Test2 extends Test1{
    Test2(){
       super(12,5);
        System.out.println("c");
    }
    Test2(int a, int b){
        this();
        System.out.println("d");
    }

    public static void main(String[] args) {
      Test2 c = new Test2(12,36);
    }
}
*/
