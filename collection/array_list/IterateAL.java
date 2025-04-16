package collection.array_list;
//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;

public class IterateAL
{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList();
        colors.add("White");
        colors.add("Blue");
        colors.add("yellow");
        colors.add("pink");

        for(String col : colors)
        {
            System.out.println(col);
        }

//        for(int i=0; i<colors.size(); i++)
//        {
//            System.out.println(colors.get(i));
//        }
    }

}
