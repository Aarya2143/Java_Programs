package object_creation;

class CloningExample implements Cloneable { // Implementing Cloneable interface
    void show() {
        System.out.println("Object creation using 'clone()' method");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calling the clone method of Object class
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloningExample obj = new CloningExample();
        CloningExample obj2 = (CloningExample) obj.clone(); // Cloning the object

        obj2.show(); // Calling the show method from cloned object
    }
}
