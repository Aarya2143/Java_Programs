package polymorphism.MethodOverLoading;

//Rule 1 : Method signature should be different

public class MethodOverloadingRule_1 {

    public void add()     //Method Signature = void add()
    {
        System.out.println("Adding Numbers");
    }

    public void add(int a)    //Method Signature = void add(int a)
    {
        System.out.println("Add number 1");
    }

    public static void main(String[] args) {
        MethodOverloadingRule_1 obj = new MethodOverloadingRule_1();
        obj.add(588);
    }
}
