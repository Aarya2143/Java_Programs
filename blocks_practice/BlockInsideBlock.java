package blocks_practice;

public class BlockInsideBlock {
// static inside static   --- Not Possible
    /*
    static {
        static{

        }
    }

    */

// Instance Inside Instance

    {
        {
            System.out.println("Instance Inside Instance");
        }
    }

    public static void main(String[] args) {
        BlockInsideBlock obj = new BlockInsideBlock();
    }
}
