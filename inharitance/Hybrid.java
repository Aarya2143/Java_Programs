package inharitance;
//------------------------------------------------ COMBO OF SINGLE & HIRARCHICAL ------------------------------------
/*
class hybrid{
    void add(){
        System.out.println("add");
    }
}
class abc extends hybrid{              // Single level
    void div(){
        System.out.println("div");
    }
}
class xyz extends abc{                          // hirarchical
    void sub(){
        System.out.println("sub");
    }
}
class djb extends abc{                         // hirarchical
    void mod(){
        System.out.println("mod");
    }

    public static void main(String[] args) {
        djb obj = new djb();
        obj.mod();
        obj.div();
        obj.add();
    }
}
/*
// ------------------------------------------------ COMBO OF SINGLE & MULTILEVEL -------------------------------------
/*
public class Hybrid {
    void add(){
        System.out.println("add to");
    }
}
class abc extends Hybrid{
    void sub(){
        System.out.println("sub to");
    }

    public static void main(String[] args) {             // Single level
        abc obj = new abc();
        obj.sub();
        obj.add();
    }
}
class hdb extends abc{
    void div(){
        System.out.println("divide to");
    }
}
class fhi extends hdb{
    void mul(){
        System.out.println("multiply to");
    }

    public static void main(String[] args) {                           //Multi level
        fhi obj = new fhi();
        obj.mul();
        obj.sub();
        obj.add();
        obj.div();
    }
}
*/
