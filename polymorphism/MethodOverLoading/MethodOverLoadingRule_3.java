package polymorphism.MethodOverLoading;

// Rule 3 : Return Type can be different

public class MethodOverLoadingRule_3
{
    void add()
    {
        System.out.println("Addition");
    }

    int add(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
        return 0;
    }

    public static void main(String[] args) {
        MethodOverLoadingRule_3 obj = new MethodOverLoadingRule_3();
        obj.add();
        obj.add(5,5);
    }
}
