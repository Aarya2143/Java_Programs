package object_creation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceConstructor {
    void show()
    {
        System.out.println("Object creation using 'New Instance of constructor class'");

    }

    public static void main(String[] args) throws InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchMethodException
    {
        Constructor <NewInstanceConstructor> constructor = NewInstanceConstructor.class.getConstructor();
        NewInstanceConstructor s = constructor.newInstance();
        s.show();
    }
}
