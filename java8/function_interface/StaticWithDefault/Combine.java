package java8.function_interface.StaticWithDefault;

@FunctionalInterface
interface Combine {
    void add();

    default void show(){
        System.out.println("default method");
    }

    static void disp() {
        System.out.println("static method");
    }

    static void disp(int a){
        System.out.println("static method with para");
    }

    public static void main(String[] args) {
        Combine.disp(12);
        Combine.disp();

        Combine obj = new Combine()
        {
            @Override
            public void add() {
                System.out.println("aarya");
            }
        };

        obj.add();
        obj.show();
    }

}
/*
class abc implements Combine{

    @Override
    public void add() {
        System.out.println("add method implementation");
    }

    @Override
    public void show() {
        Combine.super.show();
    }

    public static void main(String[] args) {
        abc obj = new abc();
        obj.add();
        obj.show();
        Combine.disp();
    }
}*/
