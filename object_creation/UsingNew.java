package object_creation;

public class UsingNew
{
    void show()
    {
        System.out.println("Object creation using 'NEW' keyword");
    }
    public static void main(String[] args) {
        UsingNew obj = new UsingNew();
        obj.show();
    }
}
