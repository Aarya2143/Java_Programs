package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class StringDesc implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

class Sample1{
    public static void main(String[] args) {
        StringDesc desc = new StringDesc();

        TreeSet<String> str = new TreeSet<>(desc);
        str.add("Aarya");
        str.add("Sanjay");
        str.add("Jadhav");
        str.add("Revati");
        str.add("Hindraj");

        for(String s1 : str){
            System.out.println(s1);
        }
    }
}