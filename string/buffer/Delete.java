package string.buffer;

public class Delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java is programming lang");
        System.out.println(sb.delete(5,8));
        System.out.println(sb.deleteCharAt(5));
    }
}
