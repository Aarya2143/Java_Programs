package anonymous;

public class AnonymousExtendsClass {
    public static void main(String[] args) {
        Thread obj = new Thread()
        {
            public void run()
            {
                System.out.println("Anonimous extends an normal class");
            }
        };
        obj.run();
    }
}
