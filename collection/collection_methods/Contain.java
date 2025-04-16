package collection.collection_methods;

import java.util.ArrayList;

public class Contain {
    public static void main(String[] args) {
        ArrayList cosmetic = new ArrayList();
        cosmetic.add("lipstick");
        cosmetic.add("Eyeliner");
        cosmetic.add("Eyeshadow");
        cosmetic.add("blush");

        System.out.println("Is contain lipstick: "+cosmetic.contains("lipstick"));
        System.out.println("Is contain maskara: "+cosmetic.contains("maskara"));
    }
}
