package collection.array_list;
//Write a Java program to search for an element in an array list.
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("Apple");
        obj.add("kiwi");
        obj.add("mango");
        obj.add("banana");
        obj.add("dates");

        String Searchfruit = "mango";

        if(obj.contains(Searchfruit))
        {
            System.out.println("Element found at index: "+obj.indexOf(Searchfruit));
        }else {
            System.out.println("Element index not found");
        }



    }
}
