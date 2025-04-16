package collection.SynchronizedAL;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class UsingCopyOnArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> str = new CopyOnWriteArrayList<>();
        str.add("Aaa");
        str.add("Bbb");
        str.add("Ccc");
        str.add("Ddd");
        str.add("Eee");

        Iterator<String> itr = str.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            str.add(5,"Fff");
            System.out.println(s);
        }
        System.out.println(str);
    }
}
