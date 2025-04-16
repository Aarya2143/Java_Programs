package abstraction;


//Rule 5 : non abstract method extends abstract class mendatory to give implementation of parent class
// -------------------------------------------------------------- 2 --------------------------------------------
/*
abstract class abc {
    abstract void jvm();
}
abstract class xyz extends abc{
    abstract void jdk();
}
abstract class pqy extends xyz{
    abstract void jre();
}
abstract class gyu extends pqy{
    abstract void hij();
}
abstract class hii extends pqy{
    abstract void nun();
}
class llb extends pqy{
    public static void main(String[] args) {
        llb l = new llb();
        l.jdk();
        l.jre();
        l.jvm();
    }

    @Override
    void jre() {
        System.out.println("java runtime environment");
    }

    @Override
    void jdk() {
        System.out.println("development kit");
    }

    @Override
    void jvm() {
        System.out.println("virtual machine");
    }
}
*/
// -----------------------------------------------------------------------1 ----------------------------------------
/*
abstract class RuleNo5 {

    abstract void add();

    abstract void sub();
}

class RuleNo5of2 extends RuleNo5{
    @Override
    void add()
    {
        int a = 2+6;
        System.out.println(a);
    }

    @Override
    void sub()
    {
        int b = 6-3;
        System.out.println(b);
    }
}
class result{
    public static void main(String[] args) {
        RuleNo5of2 rul = new RuleNo5of2();
        rul.add();
        rul.sub();
    }
}

 */
//--------------------------------------------
 abstract class ABJ{
     abstract void add();

     abstract void sub();
}
abstract class hip extends ABJ{
     abstract void div();

     void mul(){
         System.out.println("print");
     }
}
 class holl extends hip {
    void res() {
        System.out.println("me");
    }

    @Override
    void add() {
        System.out.println("add two no: ");
    }

     @Override
     void sub() {

     }

     @Override
    void div() {
        int c = 12+3;
        System.out.println("div two no: " + c);
    }
     public static void main(String[] args) {
         holl h = new holl();
         h.mul();
         h.div();
         h.add();
         h.sub();
         h.res();
     }
 }

