package collection.array_list;
//Write a Java program to update an array element by the given element
import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("cherry");
        fruit.add("banana");

        System.out.println("Orginal list: "+fruit);

        int index = 2;
        String newelement = "Blueberry";

        if(index >= 0 && index< fruit.size())
        {
            fruit.set(2,newelement);
            System.out.println("Updated List: "+fruit);
        }
    }
}
