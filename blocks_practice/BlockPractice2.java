package blocks_practice;

public class BlockPractice2 {

    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }

    public static void main(String[] args) {
        BlockPractice2 O = new BlockPractice2();
    }

}
