package collection.array_list;
//Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.ArrayList;

public class PrintingAL {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("White");
        obj.add("Blue");
        obj.add("Red");
        obj.add("Orange");
        obj.add("Yellow");

        System.out.println(obj);

        for(int i=0; i<obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }
    }
}
