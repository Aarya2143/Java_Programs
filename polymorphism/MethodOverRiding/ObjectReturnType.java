package polymorphism.MethodOverRiding;

public class ObjectReturnType {

    ObjectReturnType show(){
        System.out.println("User define return type insted of premitive ex. int");
        return null;
    }

    public static void main(String[] args) {
        ObjectReturnType n =  new ObjectReturnType();
        n.show();
    }
}
