package javabasics;

public class UnaryOperator {
/* -----------------------------------------------------  Logical NOT  -------------------------------------------------
    public static void main(String[] args) {
        boolean test = true ;
        System.out.println(!test);
    }
 */

    /* --------------------------------------------- (Pre Decrement & Post Decrement) --------------------------------
    public static void main(String[] args) {
        int a = 200;
        // Pre Decrement : Decrease First Then display a result
        System.out.println(--a);

        int b = 100;
        // Post Decrement : First Display value then do decrement in next line
        System.out.println(b--);
        System.out.println(b);
     */

    //----------------------------------------   (Pre increment & Post increment)  -------------------------------
    public static void main(String[] args) {

        int a = 100;
        // Pre Increment : First do increment and then display result
        System.out.println(++a);

        int b = 200;
        // POST Increment : First display the value and then increment in nxt line
        System.out.println(b++);
        System.out.println(b);

    }
       /*---------------------------------------------   Using ( +, -)   --------------------------------------------
       int a = 100;
        a = a + 1; // increment a by 1
        System.out.println(a); // output = 101

        int b = 200;
        b = b - 1; // decrement b by 1
        System.out.println(b); // output = 99
    }
     */
}
