package collection.collection_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAll {
    public static void main(String[] args) {
        List<String> obj1 = new ArrayList<>(Arrays.asList("Aarya","Sanjay","Jadhav"));
        List<String> obj2 = new ArrayList<>(Arrays.asList("Sanjay","Asaram","Jadhav"));

        obj1.retainAll(obj2);

        System.out.println("After Retain all: "+obj1);
    }
}
