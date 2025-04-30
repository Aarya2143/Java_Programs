package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class StringAsen implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class Sample{
    public static void main(String[] args) {
        StringAsen str = new StringAsen();

        TreeSet<String> tss = new TreeSet<>(str);
        tss.add("Sanjay");
        tss.add("Aarya");
        tss.add("Jadhav");
        tss.add("Revati");

        for(String st1 : tss){
            System.out.println(st1);
        }
    }
}