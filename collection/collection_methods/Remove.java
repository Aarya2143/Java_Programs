package collection.collection_methods;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList flowers = new ArrayList();
        flowers.add("lili");
        flowers.add("rose");
        flowers.add("sunflower");
        flowers.add("tulipogra");
        flowers.add(1);
        flowers.add(2);

        System.out.println("Original list: "+flowers);
        flowers.remove("rose");
        System.out.println("Remove Rose: "+flowers);
        flowers.remove(Integer.valueOf(1));              //For Integer Removal by element not indexing we use valueof() method
        System.out.println("Remove 1: "+flowers);
    }
}
