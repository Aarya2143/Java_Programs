package assignment2;

public class TwoD_Array {
    public static void main(String[] args) {
        int [][]x={{10,20,30},
                   {40,50,60}};
        for(int i=0; i<x.length; i++)
        {
            for(int j = 0; j<x[i].length; j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
