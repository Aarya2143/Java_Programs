package annotation_userdefine;

@interface  StringAnot
{
    String value();
}

public class Annotation {
    @StringAnot(value = "Aarya")
    public void mymethod(){
        System.out.println("Custome Annotation");
    }

    public static void main(String[] args) {
        Annotation obj = new Annotation();
        obj.mymethod();
    }
}

