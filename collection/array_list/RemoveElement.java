package collection.array_list;
//Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(4);

        int index = 2;

        if(index >=0 || index < list.size())
        {
            list.remove(index);
            System.out.println(list);
        }
    }
}
