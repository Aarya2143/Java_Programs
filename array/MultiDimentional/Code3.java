package array.MultiDimentional;

public class Code3 {
    public static void main(String[] args) {
        int[][] a = {{1,2,6},{4,2,9},{8,8,5}};
        for (int i=0; i<3; i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
