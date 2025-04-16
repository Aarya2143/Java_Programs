package collection.array_list;

//Write a Java program to copy one array list into another.

import java.util.ArrayList;
public class CopyList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("original list: "+list);

        ArrayList<Integer> list1 = new ArrayList<>(list);
//        for (int i=0; i<list1.size(); i++){
//            list1.add(null);
//        }
//        Collections.copy(list,list1);
        System.out.println("list 1 elements: "+list1);

    }
}
