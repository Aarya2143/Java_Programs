package javabasics;

public class CompoundOperator {
    public static void main(String[] args) {
        //add equals to
        int a = 50;
        a += a; // First do addition then assign the value
        System.out.println(a);

        //Substraction equals to
        int b = 100;
        b -= b; // First doing substraction then assign value
        System.out.println(b);

        //mul euals to
        int c = 2;
        c *= c; // First doing multiplication then assign value
        System.out.println(c);

        //division equals to
        int d = 12;
        d /= d; // First doing division then assign value
        System.out.println(d);

        //modulus equals to
        int e = 56;
        e %= e;  // First doing modulus then assign value
        System.out.println(e);
    }
}
