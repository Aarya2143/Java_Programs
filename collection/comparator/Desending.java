package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Desending implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
class Normal2 {
    public static void main(String[] args) {
        Desending desc = new Desending();

        TreeSet<Integer> tsc = new TreeSet<>(desc);
        tsc.add(24);
        tsc.add(85);
        tsc.add(34);
        tsc.add(9);
        tsc.add(87);

        for(Integer it : tsc){
            System.out.println(it);
        }
    }
}