package collection.array_list;

import java.util.ArrayList;

public class ManuallyIncreaseCapcity {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.ensureCapacity(20);
        al.trimToSize();

        al.add("a");
        al.add("");
        al.add("e");
        al.add("r");

       // System.out.println(al);
        for (String s : al){
            System.out.println(s);
        }
    }
}
