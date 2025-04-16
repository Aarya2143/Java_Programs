package instance_block;

public class ClassWithultipleInstanceBlock {

    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance Block 2");
    }

    {
        System.out.println("Instance Block 3");
    }

    public static void main(String[] args) {
        ClassWithultipleInstanceBlock OBJ = new ClassWithultipleInstanceBlock();
    }
}
