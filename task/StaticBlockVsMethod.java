package task;

public class StaticBlockVsMethod {
 //Static Block
    static
    {
        System.out.println("Static block");
    }

 //Static Method
   static void add()
   {
       System.out.println("Static Method");
   }

    public static void main(String[] args) {
        StaticBlockVsMethod obj = new StaticBlockVsMethod();
        add();
    }
}
