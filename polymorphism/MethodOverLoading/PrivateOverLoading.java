package polymorphism.MethodOverLoading;

public class PrivateOverLoading {
    private void add(char c)
    {
        System.out.println("private method 1");
    }
}
class PrivateMethod2 extends PrivateOverLoading
{
    private void add(int a)
    {
        System.out.println("private method 2");
    }

    public static void main(String[] args) {
        PrivateMethod2 pvt = new PrivateMethod2();
        pvt.add(12);
        pvt.add('g');
    }
}
