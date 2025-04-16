package polymorphism.MethodOverRiding;

//RuleNo_2 : child class Method signature should be as same as the parent class method signature

public class RuleNo_2 {
    void add(int a)
    {
        System.out.println("parent class");
    }
}
class child_1 extends RuleNo_2{
   void add(int a)
   {
       System.out.println("child class");
   }

    public static void main(String[] args) {
        child_1 obj = new child_1();
        obj.add(12);

        RuleNo_2 obj1 = new RuleNo_2();
        obj.add(2);
    }
}
