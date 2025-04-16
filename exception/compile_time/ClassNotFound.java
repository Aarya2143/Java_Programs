package exception.compile_time;

//Class does not exist in the classpath

public class ClassNotFound
{
    void show(){
        System.out.println("hi");
    }
    /*
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassNotFound n = (ClassNotFound)
        Class.forName("exception.compile_time.ClassNotFound1").newInstance();
        n.show();
    }
    */

    public static void main(String[] args) {
      try {
          ClassNotFound cs = new ClassNotFound();
          Class.forName("exception.compile_time.ClassNotFound");
          cs.show();
      }
      catch (ClassNotFoundException e){
          System.out.println("Class is not present or incorrect class is entered");
      }
    }
}
