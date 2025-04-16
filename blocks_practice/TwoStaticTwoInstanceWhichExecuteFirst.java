package blocks_practice;

public class TwoStaticTwoInstanceWhichExecuteFirst {


    static
    {
        System.out.println("static block 1");
    }

    {
        System.out.println("instance block 1");
    }

    public static void main(String[] args){
      TwoStaticTwoInstanceWhichExecuteFirst obj = new TwoStaticTwoInstanceWhichExecuteFirst();
    }
}
