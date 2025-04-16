package task;

/* ----------------------------------------------- Arithmatic Exception -----------------------------------------

//Occurs When perform illegal arithmetic operation

public class Arithmetic {

    public static void main(String[] args)
    {
        int result = 10/0;            //Arithmetic Exception
    }
}
*/

// ------------------------------------------------- Null Pointer Exception -------------------------------------

// Occure When Trying to access a method of null object

/*
class NullPointer
{
    public static void main(String[] args) {
        String s1 = null;                               // Null Pointer Exception
        System.out.println(s1.length());
    }
}
*/

// ----------------------------------------------- Array Index Out Of Bound --------------------------------------------

//Occurs when trying to access an array element with an invalid index

/*
class ArrayIndexOutOfBound
{
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int num = arr[5];                               //Array Index Out Of Bound
    }
}
*/

// ------------------------------------------------- String Index Out Of Bound ------------------------------------------

// Occurs when trying to access an invalid index of String

/*
class StringIndexOutOfBound
{
    public static void main(String[] args) {
        String s1 = "Aarya";
        System.out.println(s1.charAt(7));         //String Index Out Of Bound
    }
}
*/

/* ---------------------------------------------------- Illegal Argument --------------------------------------------

// Occure when a method is passed an invalid argument

class IllegalArgument
{
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(-1000);                                          //timeout value is negative
    }
}
*/
// -------------------------------------------------- Class cast Exception ---------------------------------------

// Occure when trying to cast an object to an incompatible type
/*
class ClassCast
{
    public static void main(String[] args) {
       Object obj = new String("hello");
       Integer num = (Integer) obj;                                //Class cast Exception
    }
}
*/