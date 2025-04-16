package arrays.methods;

public class HashCode {
    public static void main(String[] args) {
        String[] s1 = {"A","b","c","d"};
        String[] s2 = {"A","b","c","d"};
        int[] a = {1,2,3,4,5,6};
        char[] b = {'A','B','C','D','E','F','s','v'};

        System.out.println("Hashcode for string: "+s1.hashCode());
        System.out.println("Hashcode for string: "+s2.hashCode());
        System.out.println("Hashcode for integer: "+a.hashCode());
        System.out.println("Hashcode for Character: "+b.hashCode());
    }
}
