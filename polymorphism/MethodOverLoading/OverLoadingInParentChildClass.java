package polymorphism.MethodOverLoading;

public class OverLoadingInParentChildClass {
    void add(int a, int b)
    {
        System.out.println("Method 1");
    }
}
class ChildClass extends OverLoadingInParentChildClass{
    void add(int a, float j)
    {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ch.add(14,41);
        ch.add(58, 5.5F);
    }
}