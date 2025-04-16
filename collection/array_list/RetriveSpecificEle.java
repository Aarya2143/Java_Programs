package collection.array_list;

import java.util.ArrayList;
//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetriveSpecificEle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("kiwi");

        int index = 2;

        if(index >= 0 && index < list.size())
        {
            System.out.println("Element at index: "+index+" is "+ list.get(index));
        }
        else {
            System.out.println("Invalid Index");
        }
    }
}
