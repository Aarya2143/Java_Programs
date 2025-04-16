package map.Methods;
import java.util.HashMap;

public class ReplaceAll {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("ABC",1);
        obj.put("XYZ",2);
        obj.put("uxv",3);

        obj.replaceAll((Key, Value)->Value*2);

        System.out.println(obj);

    }
}
