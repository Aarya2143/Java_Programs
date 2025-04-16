package collection.collection_methods;

import java.util.ArrayList;

public class IsEmpty {
    public static void main(String[] args) {
        ArrayList subjects = new ArrayList();
        subjects.add("Hindi");
        subjects.add("marathi");
        subjects.add("geography");

        System.out.println("Is empty: "+subjects.isEmpty());

        subjects.clear();
        System.out.println("Is empty: "+subjects.isEmpty());
    }
}
