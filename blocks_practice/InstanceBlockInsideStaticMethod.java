package blocks_practice;

public class InstanceBlockInsideStaticMethod {
    static void add()
    {
        {
            System.out.println("Instance Block Inside Static Method");
        }
    }

    public static void main(String[] args) {
        InstanceBlockInsideStaticMethod obj = new InstanceBlockInsideStaticMethod();
        add();
    }

}
