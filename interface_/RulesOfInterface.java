package interface_;

/*
class extend class => extends
interface extends interface => extends
class implement interface => implements
*/


/*
interface abc {
    void add();
}
interface xyz{
    void div();
}
interface guy extends abc, xyz
{
    void mul();
}
class uyi implements guy{
    public static void main(String[] args) {
        uyi obj = new uyi();
        obj.add();
        obj.div();
        obj.mul();
    }

    @Override
    public void mul() {
        System.out.println("mul");
    }

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void div() {
        System.out.println("div");
    }
}
*/
//--------------------------------------------------------- 2 --------------------------------------
/*
 interface RulesOfInterface {
     void show();
}
interface Rule1{
     void disp();
}
abstract class abc implements RulesOfInterface,Rule1{
     void print(){

     }
}
class xyz extends abc {
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.disp();
        obj.show();
    }

    @Override
    public void disp() {
        System.out.println("im");
    }

    @Override
    public void show() {
        System.out.println("aarya");
    }
}
*/