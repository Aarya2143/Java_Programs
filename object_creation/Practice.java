package object_creation;

/*
public class Practice {
    void disp(){
        System.out.println("forname");
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Practice pr = (Practice)
                Class.forName("ObjectCreation.Practice").newInstance();
        pr.disp();
    }
}


class Practice2 implements Cloneable
{
    void disp()
    {
        System.out.println("usin clone");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calling the clone method of Object class
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Practice2 pr1 = new Practice2();
        Practice2 pr5 = (Practice2) pr1.clone();
        pr5.disp();
    }
}

public class Practice{
    public Practice()
    {
        System.out.println("constructor");
    }
    void disp(){
        System.out.println("New instance constructor");
    }

    public static void main(String[] args) throws InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchMethodException
    {
        Constructor <Practice> Constructor = Practice.class.getConstructor();
        Practice par = Constructor.newInstance();
        par.disp();
    }
}
*/