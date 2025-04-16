package exception.run_time;

public class ClassCast {
    void show(){
        System.out.println("parent");
    }
}
class Classcast2 extends ClassCast
{
    void disp(){
        System.out.println("child");
    }

    public static void main(String[] args) {
       try{
           // ClassCast obj = new Classcast2();                    // Upcasting
           Classcast2 obj = (Classcast2) new ClassCast();          // Downcasting
           obj.disp();
           obj.show();
       }
       catch (ClassCastException cc){
           System.out.println("Downcasting is not allowed");
       }
    }
}
