package exception.TryWithResource;

public class TrywithResource implements AutoCloseable {
    void show()
    {
        System.out.println("hii try with resource");
    }

    public static void main(String[] args) throws Exception {

        try(TrywithResource obj = new TrywithResource())
        {
        TrywithResource obj2 = null;
         obj2.show();
        }
        catch (Exception ex){
            System.out.println("catch block");
        }
    }

    @Override
    public void close() throws Exception       //Only use for close connection (do write another code inside close method)
    {
        System.out.println("resource are close");
    }
}
