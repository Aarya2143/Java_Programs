package collection.AL_method;

import java.util.ArrayList;
import java.util.List;

public class AddIndexObj {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add(0,"ABC");
        obj.add(1,"XYZ");
        obj.add(2,"UVX");
        obj.add(3,"XUV");

        System.out.println(obj);
    }
}
