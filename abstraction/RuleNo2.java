package abstraction;

//----------------------- Rule 2 : If we take Abstract method need to declare class as abstract class ----------------------------

abstract class RuleNo2 {
    abstract void show(int a);
}
abstract class SubRule1 {
    abstract void show(int b);
}
abstract class SubRule2{
    abstract void show(int c);
}

class SubClass3 extends RuleNo2 {
    public static void main(String[] args) {
        SubClass3 sub = new SubClass3();
        sub.show(12);
    }
    @Override
    void show(int a) {
      System.out.println(a);
    }
}