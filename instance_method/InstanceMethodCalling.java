package instance_method;

public class InstanceMethodCalling {
    void show(){
        System.out.println("need to create obj for call instace method");
    }

    public static void main(String[] args) {
        InstanceMethodCalling obj = new InstanceMethodCalling();
        obj.show();

    }
}
