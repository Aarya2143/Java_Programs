package java8;

interface abc{
    default void show(){
        System.out.println("1st method");
    }
}

interface xyz{
    default void show(){
        System.out.println("2nd method");
    }
}

public class SolveDimondProblem implements abc, xyz {
    @Override
    public void show() {
        xyz.super.show();
        abc.super.show();
    }

    public static void main(String[] args) {
        SolveDimondProblem obj = new SolveDimondProblem();
        obj.show();
    }
}

