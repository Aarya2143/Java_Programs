package java8.function_interface;

//In Normal interface the interface only have abstract methods and we need to override in concreate class

public interface NormalInterface {
    void show();

    void test();
}

class esult implements NormalInterface{

    @Override
    public void show() {
        System.out.println("Add");
    }

    @Override
    public void test() {
        System.out.println("sub");
    }

    public static void main(String[] args) {
      result obj = new result();
      obj.show();
     // obj.test();
    }
}
