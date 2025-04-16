package string.builder_to_buffer;

//NOT directly convert builder to buffer need to convert inbuild to string methode

public class BuilderToBuffer {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("java");
        System.out.println(st);

        String st1 = st.toString();

        StringBuffer st2 = new StringBuffer(st1);
        System.out.println(st2);
    }
}
