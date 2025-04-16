package collection.array_list;

import java.util.ArrayList;
//Write a Java program to insert an element into the array list at the first position.
public class InsertElementAtFirst {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("skin");
        colors.add("grey");
        colors.add("yellow");

        colors.add(0,"Pink");

        for(String col: colors)
        {
            System.out.println(col);
        }

    }
}
