package collection.collection_methods;

import java.util.ArrayList;

public class HashCode {
    public static void main(String[] args) {
        ArrayList department = new ArrayList();
        department.add("civil");
        department.add("electrical");
        department.add("it");

        System.out.println("Hash code of IT: " +department.hashCode());
    }
}
