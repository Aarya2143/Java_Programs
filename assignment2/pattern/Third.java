package assignment2.pattern;

public class Third {
    public static void main(String[] args) {
        for (int i=1 ; i<=5; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
