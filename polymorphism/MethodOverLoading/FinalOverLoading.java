package polymorphism.MethodOverLoading;

public class FinalOverLoading {
    final void add(int c , char a)
    {
        System.out.println("Final method 1");
    }
}
class Finalclass2 extends FinalOverLoading
{
    final void add(int d)
    {
        System.out.println("Final Method 2");
    }

    public static void main(String[] args) {
        Finalclass2 fin = new Finalclass2();
        fin.add(6, 'd');
        fin.add(3);
    }
}
