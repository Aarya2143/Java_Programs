package task;

public class Variable {
    int a; //Instance
    static int b; //Static Variables

    void show(){
        int d=1; //Local Variables
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        Variable var = new Variable();
        System.out.println(var.a);
        System.out.println(b);
        var.show();
    }
}
