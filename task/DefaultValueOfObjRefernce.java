package task;
public class DefaultValueOfObjRefernce {
    int ref;

    void show(){
        System.out.println("Reference name is: "+ref);
    }
    public static void main(String[] args) {
        DefaultValueOfObjRefernce method = new DefaultValueOfObjRefernce();
        method.show();
    }
}
