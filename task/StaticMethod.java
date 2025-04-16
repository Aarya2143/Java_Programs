package task;

public class StaticMethod {
    static int show(){
        System.out.println("static method");
        return 0;
    }
}
    class class2{
        static int show(){
            System.out.println("static 2");
            return 0;
        }

    public static void main(String[] args)
    {
       show();
       StaticMethod.show();
    }
}
