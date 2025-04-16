package blocks_practice;

public class InstanceBlockInsideStaticBlock {
    static {
        {
            System.out.println("Instance Block Inside Static Block");
        }
    }
    public static void main(String[] args) {

    }
}
