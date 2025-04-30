package collection.arraylist_method;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aarya");
        list.add("bhaiya");
        list.add("Megha didi");
        list.add("nikhil");
        list.add("vivek");
        list.add("bhauji");
        list.add("x bahin");

        list.remove("Megha didi");
        System.out.println(list);
    }
}
