package javabasics;

public class LoopStatement {
    // ---------------------------------------- For Each Loop ---------------------------------------
    public static void main(String[] args) {
        int [] a={5,7,8,4,9,2,4};
        for (int num : a)
        {
            System.out.println(num);
        }
    }
}
    /*
// ARROW PRINTING
    public static void main(String[] args) {
        int n = 5;
        int a = 2;
        int b = 6;
        for (int i = 0; i < n; i++) //rows
        {
            for (int j = 0; j < n; j++) //columns
            {
                    if (j - i == a || i + j == b || i == a)
                    {
                        System.out.print(" *"); // if this condition satisfy then print *
                    } else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
        }
    }
}
*/
    //------------------------------------------------------- Do While Loop -----------------------------------------------
    /*
      int x = 25;
        do{
            System.out.println("do");
        }
        while (x > 20); //Condition satisfy and print do (infinite time)
    */

    /*
        int a = 0;
 do{
     System.out.println("print do");
 }
 while(a > 20);   //Condition not satisfy sill print the value it is rule of do while loop
     */
 //-------------------------------------------------------- while loop -------------------------------------------------
 /*
 int b = 0;
 while (b < 10)
 {
     System.out.println("value is: "+b);
     b = b + 10;
 }
 */
//--------------------------------------------------------- For Loop ---------------------------------------------------
        /*
        for (int i = 1; i >= 20; i--){
            System.out.println("what is print ?");  //Nothing going to print because condition 2 is not satisfying
        }
        */

        /*
        for(int i = 1; i <= 100; i++){
            System.out.println("value of a is: " + i); // 1 to 100 print
        }
        */


        /*
        for(int i = 20; i>=1; i--){
            System.out.println("value a is:"+i); // 20 to 1 will print
        }
        */
        /*--------------------------------------------- even odd ---------------------------------------------------
        for(int i = 2; i <= 20; i++){
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            }
            else {
                System.out.println(i+ "is odd");
            }
        }
         */





