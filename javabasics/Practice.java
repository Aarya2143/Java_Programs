package javabasics;

public class Practice {
/*
    public static void main(String[] args) {
        // --------------------------------------------------- final variable ---------------------------------------
        /*
         final int a = 12; // if i remove final then it work
         a = 52;
        System.out.println(a);
    }
    */
        // ---------------------------------------------------- final class -----------------------------------------
/*
        final class abc {
            void show() {
                System.out.println("drive");
            }
        }
        class b extends abc {
            void race() {
                System.out.println("ride");
            }

        }
    }
 */

        //---------------------------------------------------- final method ------------------------------------------
        /*
        class animal{
        final void animal(){
            System.out.println("shout like");
        }
        }
        class dog extends animal{
            void animal(){
                System.out.println("bark");
            }
        }
    }
      */

    
/*----------------------------------------------------- SWAPPING OF TWO NUMBER ----------------------------------------
    public static void main(String[] args)
    {
        Practice prac = new Practice();
        int a = 10;
        System.out.println("enter no 1st: "+a);
        int b = 20;
        System.out.println("enter no 2nd: "+b);

        System.out.println("Before SWAPPING : first no is:"+a+ "  second no is:"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After SWAPPING : first no is:"+a+ "  second no is:"+b);
    }
*/
/*-------------------------------------------------------- ODD AND EVEN NO -------------------------------------------
    public static void main(String[] args) {
        Scanner wait = new Scanner(System.in);
        System.out.println("enter the no:");
        int no = wait.nextInt();

        if (no % 2 == 0) {
            System.out.println(no + " is even.");
        } else {
            System.out.println(no + " is odd.");
        }
    }
*/
/*-------------------------------------------------------- VARIABLE PRINTING -------------------------------------------
     int n = 12;
     boolean s = true;
     float jad = 12.3f;
     double hh = 55.63;
     char jah = 'a';
     String aarya = "hello my name is aarya and ";

    public static void main(String[] args)
    {
        int b = 5;
        Practice p = new Practice();
        System.out.print(p.aarya);
        System.out.println("my actual age is:" + p.aarya);
    }

/*-------------------------------------------------- Arithmatic Operator ----------------------------------------------
void add(){
        int a = 20;
        int b = 10;
        int c = a+b;
        System.out.println(c);
    }

    void sub(){
        int a= 20;
        int b = 10;
        int c = a-b;
        System.out.println(c);
    }

    void div(){
        int a = 12;
        int b = 2;
        int c = a/b;
        System.out.println(c);
    }

    void mul(){
        int a= 2;
        int b = 2;
        int c = a*b;
        System.out.println(c);
    }

    void mod(){
        int a = 5;
        int b = 55;
        int c = a%b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Practice p = new Practice();
        p.add();
        p.sub();
        p.div();
        p.mul();
        p.mod();
    }
*/
    /*
public static void main(String[] args) {
    int a = 55;
    if (a %2 == 0)
    {
        System.out.println("no is even");
    }
    else {
        System.out.println("odd no");
    }
}

     */

        }