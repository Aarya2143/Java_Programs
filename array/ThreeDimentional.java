package array;

public class ThreeDimentional {
    public static void main(String[] args) {
        char[][][] f = new char['h']['b']['i'];
        byte[][][] b = new byte[8][4][2];
        int[][][] n = new int[896][56][5];
        short[][][] s = new short[6][55][58];
        boolean[][][] j = new boolean[0][1][0];

        System.out.println(f.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(n.getClass().getName());
        System.out.println(s.getClass().getName());
    }
}
