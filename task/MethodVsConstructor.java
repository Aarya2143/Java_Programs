package task;

public class MethodVsConstructor {

 //METHOD
    void MethodVsConstructor(){
        System.out.println("aaple");
    }

 //CONSTRUCTOR
    MethodVsConstructor(){
        System.out.println("pple");
    }

    public static void main(String[] args) {
        MethodVsConstructor obj = new MethodVsConstructor();
        obj.MethodVsConstructor();
    }
}
