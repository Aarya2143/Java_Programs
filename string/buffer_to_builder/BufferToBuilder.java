package string.buffer_to_builder;

//NOT directly convert buffer to builder need to convert inbuild to string methode

public class BufferToBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb);

        String sb1 = sb.toString();

        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb2);
    }
}
