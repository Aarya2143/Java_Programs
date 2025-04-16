package object_creation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
public class Practice1{
    int add()
    {
        int a= 2+2;
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Practice1 obj = (Practice1)
            Class.forName("ObjectCreation.Practice1").newInstance();
    obj.add();
    }
}


class PrcClone implements Cloneable
{
    int mul()
    {
        int b = 2*2;
        System.out.println(b);
        return b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrcClone obj = new PrcClone();
        PrcClone OBJ2 = (PrcClone)obj.clone();
        OBJ2.mul();
    }
}
*/
public class Practice1
{
    void mul(){
        int d = 12/2;
        System.out.println(d);
    }

    public static void main(String[] args) throws InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchMethodException
    {
        Constructor<Practice1> constructor = Practice1.class.getConstructor();
        Practice1 obj = constructor.newInstance();
        obj.mul();
    }

}