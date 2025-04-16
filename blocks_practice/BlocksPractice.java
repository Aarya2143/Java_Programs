package blocks_practice;

public class BlocksPractice {

 static{
     System.out.println("static method 1");
 }

 static {
     System.out.println("static method 2");
 }

  BlocksPractice()
  {
        System.out.println("Constructor 1");
  }

  BlocksPractice(int a, float b)
    {
        System.out.println("Constructor 2");
    }

    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }

    public static void main(String[] args) {
        BlocksPractice OBJ = new BlocksPractice();
        BlocksPractice ob = new BlocksPractice(12,5.5f);
    }


}
