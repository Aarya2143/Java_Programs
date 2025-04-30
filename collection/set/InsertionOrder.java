package collection.set;

import java.util.HashSet;
import java.util.Set;

public class InsertionOrder {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("aa");
        set.add("bb");
        set.add("cc");

       /* for(int i=0; i< set.size(); i++){
            System.out.println("element is: "+i);
        }*/

     System.out.println(set);
    }
}
