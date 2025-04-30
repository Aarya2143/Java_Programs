package collection.synchronizedAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListMethod {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ABC");
        arr.add("XYZ");
        arr.add("PQR");
        arr.add("STU");

        List<String> synclist = Collections.synchronizedList(arr);

        synchronized (synclist){
            Iterator<String> itr = synclist.iterator();
            while(itr.hasNext()){
                String str = itr.next();
                System.out.println(str);
            }
        }
    }
}
