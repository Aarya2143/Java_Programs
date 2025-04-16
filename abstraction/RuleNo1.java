package abstraction;
//-------------Rule No 1 : IF we declare class as a abstract class no need to declare abstract method inside that class--------------
abstract class RuleNo1
{
    void show()
    {
        System.out.println("abstraction");
    }
}
class A extends RuleNo1
{
    public static void main(String[] args)
    {
        A a = new A();
        a.show();
    }
}