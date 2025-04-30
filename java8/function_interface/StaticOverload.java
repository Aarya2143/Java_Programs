package java8.function_interface;

@FunctionalInterface
public interface StaticOverload {
    void  show();

   static void add(){
       System.out.println("static method");
    }

    static void add(String s){
        System.out.println("satic param");
    }
}

class result implements StaticOverload
{
    @Override
    public void show() {
        System.out.println("Show overriden");
    }

    public static void main(String[] args) {
        result obj = new result();

        StaticOverload.add();
        StaticOverload.add("Aar");
    }
}