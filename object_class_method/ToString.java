package object_class_method;

public class ToString {
    String name;
    int rollno;

   ToString(String name, int rollno){
    this.name = name;
    this.rollno = rollno;
    }

    public static void main(String[] args) {
        ToString OBJ = new ToString("Aarya",55);
        ToString OBJ2 = new ToString("PRIYA",25);
        System.out.println(OBJ);
        System.out.println(OBJ2);
    }

}
