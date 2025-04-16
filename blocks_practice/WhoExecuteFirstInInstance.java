package blocks_practice;

public class WhoExecuteFirstInInstance {
    int b = 12;

    void show(){
        System.out.println("Instance Method");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
       WhoExecuteFirstInInstance obj = new WhoExecuteFirstInInstance();
       System.out.println(obj.b);
       obj.show();
    }
}
