package collection.array_list;

//Write a Java program to sort a given array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class SortAL {
    //BubbleSort
    public static void bubbleSort(ArrayList<Integer> list)
    {
       // int n = list.size();
        for (int i=0; i<list.size()-1; i++)
        {
         for(int j=0; j<list.size()-i-1; j++)
         {
             if(list.get(j)>list.get(j+1))
             {
                int temp = list.get(j);
                list.set(j, list.get(j+1));
                list.set(j+1,temp);
             }
           }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(3);

        System.out.println("Original list: "+arr);
        SortAL sorter = new SortAL();
        sorter.bubbleSort(arr);
        System.out.println("Sorted list: "+arr);
    }
}
