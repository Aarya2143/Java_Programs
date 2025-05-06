package task;

public class testing {
    String a;
    boolean b;

    void add(String a, boolean b ) {
        System.out.println("S");
    }

    void add(Integer a, boolean b) {
        System.out.println("I");
    }

    public static void main(String[] args) {
        testing s = new testing();
//        s.add(null,true);
    }
}


class demo{
    public static void main(String[] args) {
        System.out.println(args[6]);
    }
}