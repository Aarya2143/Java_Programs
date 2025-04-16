package collection.list.list_iterator_method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PreviewIndex {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");

        ListIterator<String> iterator = obj.listIterator();

        while (iterator.hasNext())
        {
            if(iterator.next().equals("D"))
            {
              break;
            }
        }

        System.out.println("Previous");

        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}
