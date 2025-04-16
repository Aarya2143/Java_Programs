package collection.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.RandomAccess;

// Write a Java program to shuffle elements in an array list.
public class ShuffleElement implements RandomAccess {

    public static void randomEle(ArrayList<String> list)
    {
        Random rnd = new Random();
        for(int i = list.size()-1; i>0; i--)
        {
            int j = rnd.nextInt(i+1);
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        System.out.println("Original list: "+list);
        randomEle(list);
        System.out.println("New element: "+list);

//        System.out.println("Original list: "+list);
//        Collections.shuffle(list);
//        System.out.println("New element: "+list);
    }
}
