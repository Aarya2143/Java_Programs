package polymorphism.MethodOverLoading;

// Rule 2 : Method OverLoading happen within the same class or should have parent child relationship

public class MethodOverLoadingRule_2
{
    int add()
    {
        int c = 12+8;
        System.out.println(c);
        return 0;
    }

    int add(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
        return 0;
    }

    public static void main(String[] args) {
        MethodOverLoadingRule_2 obj = new MethodOverLoadingRule_2();
        obj.add();
        obj.add(12,58);
    }
}
