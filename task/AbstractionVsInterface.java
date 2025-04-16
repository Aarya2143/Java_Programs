package task;

// Abstraction
abstract class AbstractionVsInterface
{
    AbstractionVsInterface()
    {
        System.out.println("Hii");
    }
}
class sk extends AbstractionVsInterface
{
    public static void main(String[] args)
    {
        sk s = new sk();
    }
}

// Interface
interface abc{
    int a = 12;
}
interface xyz{
    int b = 54;
}
//class jui implements abc, gus {
//    public static void main(String[] args) {
//        jui o = new jui();
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//}