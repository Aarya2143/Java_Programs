package enumeration;

public class InnerEnumClass {
    enum Color {
        RED,
        GREEN,
        BLUE,
        Voilet;
    }

    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.BLUE;

        System.out.println(c1);
        System.out.println(c2);
    }
}
