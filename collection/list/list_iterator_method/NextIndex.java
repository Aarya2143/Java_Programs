package collection.list.list_iterator_method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NextIndex {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> iterator = list.listIterator(); // |ABC
        System.out.println("List Iterator in Forward Direction:");


        int INDEXA = iterator.nextIndex();
        String element = iterator.next();

        int INDEXB = iterator.nextIndex();
        String element1 = iterator.next();

        int INDEXC = iterator.nextIndex();
        String element3 = iterator.next();

        System.out.println("Index is: "+INDEXA +"   Element is: "+ element);
        System.out.println("Index is: "+INDEXB+ "   Element is: "+element1);
        System.out.println("Index is: "+INDEXC+ "   Element is: "+element3 );

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
