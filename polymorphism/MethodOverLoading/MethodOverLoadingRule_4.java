package polymorphism.MethodOverLoading;

// Rule 4 : Access Modifier can be different

public class MethodOverLoadingRule_4
{
    private int add()
    {
        int c = 10+10;
        System.out.println(c);
        return c;
    }

    public void add(int a , int b, int c)
    {
        int d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethodOverLoadingRule_4 obj = new MethodOverLoadingRule_4();
        obj.add();
        obj.add(10,10,20);
    }
}
