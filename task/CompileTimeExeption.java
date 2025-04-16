package task;

import static java.lang.Class.forName;

// ----------------------------------- File not found Exception ---------------------------------
/*
//File not found : This Exception occurs when trying to access a file that does not exist or the specified path is incorrect

class FileNotFound{
    public static void main(String[] args)
    {
        FileReader obj = new FileReader("divide");              // File Not found
    }
}
*/

// --------------------------------------- IO Exception ---------------------------------
// It occurs when an input output operation fails
/*
import java.io.FileReader;

class IOException
{
    public static void main(String[] args)
    {
        FileReader fr = new FileReader("test.txt");            // IO Exception
        fr.read();
    }
}
*/

// --------------------------------------- Interrupted Exception ----------------------------
// Occure when Thread is waiting, sleeping, or blocked and another tread interrupts it
/*
class InterruptedException
{
    public static void main(String[] args) {
        Thread.sleep(1000);                    //Interrupted Exception
    }
}
*/

// ----------------------------------------- Class Not Found  ----------------------------------
//Class does not exist in the classpath
/*
class ClassNotFound
{
    public static void main(String[] args)
    {
        Class.forName("interface");        // Class Not Found
    }
}
*/

// ---------------------------------------- CloneNotSupported Exception -------------------------
// Occure When calling clone() on an object that does not implements cloneable
/*
class CloneNotSupport
{
    public static void main(String[] args)
    {
        CloneNotSupport obj = new CloneNotSupport();  //Clone Not Supported
        obj.clone();
    }
}
*/