package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Asending implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class Normal1{
    public static void main(String[] args) {
        Asending asc = new Asending();

        TreeSet<Integer> ts = new TreeSet<>(asc);
        ts.add(23);
        ts.add(3);
        ts.add(84);
        ts.add(98);
        ts.add(34);
        ts.add(65);

        for(Integer itr : ts){
            System.out.println(itr+ " ");
        }
    }
}