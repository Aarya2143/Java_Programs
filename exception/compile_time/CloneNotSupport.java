package exception.compile_time;

// Occure When calling clone() on an object that does not implements cloneable

public class CloneNotSupport
{
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneNotSupport obj = new CloneNotSupport();
        obj.clone();
    }
}
