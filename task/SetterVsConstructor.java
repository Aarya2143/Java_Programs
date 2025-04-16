package task;

public class SetterVsConstructor {
 //SETTER
    private int age;

    public void setAge(int age){
        this.age = age;
    }


 //CONSTRUCTOR
    SetterVsConstructor(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        SetterVsConstructor set = new SetterVsConstructor();
        set.setAge(12);
        System.out.println(set.age);
    }
}
