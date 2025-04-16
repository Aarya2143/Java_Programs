package constructor;

// 3-1-2-no
/*
class thiskey{
    thiskey(){
        this(2,1);
        System.out.println("no arg");
    }

    thiskey(int b,int c){
        this(2);
        System.out.println("2 args");
    }

    thiskey(int b){
       this(12,58,9);
        System.out.println("1 args");

    }

    thiskey(int b, int k,int d){
        System.out.println("3 args");
    }

    public static void main(String[] args) {

        thiskey obj = new thiskey();
    }
}
*/

//---------------------------  no - 2 - 1 - 3 ----------------------------
/*
class thiskey{
    thiskey(){
        System.out.println("no arg");
    }

    thiskey(int b,int c){
        this();
        System.out.println("2 args");
    }

    thiskey(int b){
        this(12,5);
        System.out.println("1 args");

    }

    thiskey(int b, int k,int d){
        this(12);
        System.out.println("3 args");
    }

    public static void main(String[] args) {
        thiskey obj = new thiskey(13,62,56);
    }
}
*/

//----------------------------------------  2 , 3 , no , 1 --------------------------------
/*
class thiskey{
    thiskey(){
        this(12,5,9);
        System.out.println("no arg");

    }
    thiskey(int b,int c){
        System.out.println("2 args");
    }
    thiskey(int b){
        this();
        System.out.println("1 args");

    }
    thiskey(int b, int k,int d){
        this(12,6);
        System.out.println("3 args");

    }
    public static void main(String[] args) {
        thiskey obj = new thiskey(12);
    }
}
*/

// ------------------------------------------ no - 1 -2 -3 ---------------------------------
/*
class ThisKeyword{
    ThisKeyword(int a, int b, int c) {
        this(12, 56);
        System.out.println("3 args");
    }
    ThisKeyword(int a, int b){
        this(6);
        System.out.println("2 args");
    }
    ThisKeyword(int a){
        this();
        System.out.println("1 args");
    }
    ThisKeyword(){
        System.out.println("No args");
    }

    public static void main(String[] args) {
     ThisKeyword k = new ThisKeyword(12,58,6);
    }
}
*/
//------------------------------- 3 arg - 2 arg -1 arg- no arg -------------------------
/*
// 3 arg - 2 arg -1 arg- no arg
public class This {
    This(){
        this(55);
        System.out.println("no - arg constructor");
    }

    This(int a){
        this(15,96);
        System.out.println("1 arg constructor");
    }

    This(int a, int b){
        this(12,14,15);
        System.out.println("2 arg constructor");
    }

    This(int a, int b, int c){
        System.out.println("3 arg constructor");
    }

    public static void main(String[] args) {
        This obj = new This();
    }
}
*/
