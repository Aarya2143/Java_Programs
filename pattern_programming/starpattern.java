package pattern_programming;
/*
class PatternProg{
    int n ;

    static void leftTriangle(int n) {
        int i, j;

        for(i = 1 ; i < n ; i++){
            for (j = 1 ; j < n ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        leftTriangle(n);
    }
}
*/

/*
--------- OUTPUT ---------
      *
    * *
  * * *
* * * *

*/

/*
class PatternProg{
    int n ;

    static void fullSquare(int n) {
        int i, j;

        for(i = 1 ; i< n ; i++){
            for (j = 1 ; j<n ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        fullSquare(n);
    }
}
*/

/* --------- OUTPUT -----------
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
         *  *  *  *  *
*/

/*
class ReverseTriangle {
    int n ;

    public static void reversetriangle(int n){
        int i,j;

        for(i=1 ; i<n ; i++)
        {
            for(j = 1; j<n; j++)
            {
                if(i == n || j == 1 || i==1 || j==n )
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        reversetriangle(n);
    }
}


/*
--------- OUTPUT ---------
* * * *
* * * *
* * * *

*/

/*

class PatternProgram{

    static void lefttriangle(int n){
        int i, j ;
        for( i = 1 ; i<= n ; i ++)
        {
            for (j = 1; j <= i ; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        lefttriangle(n);
    }
}


/*
--------- OUTPUT ---------
*
* *
* * *
* * * *

*/
/* -------------------------------------------- SquarePattern2 -----------------------------------
public class starpattern {

    static void squarepattern2(int n){

        int i,j;
        for (i= 1; i <= 6 ; i++)
        {
            for( j = 1; j <= 6 ; j++)
            {
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        squarepattern2(n);
    }
}
*/

/*
--------- OUTPUT ---------
* * * *
*     *
*     *
* * * *

*/
//------------------------------------------- SquarePattern1 -----------------------------------

/*
    public static void SquarePattern1(int n) {
        int i, j;

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (i == 0 || j ==0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int n = 6;
       SquarePattern1(int n);
    }
}
*/
/*
--------- OUTPUT ---------
* * * *
*     *
*     *
* * * *

*/
