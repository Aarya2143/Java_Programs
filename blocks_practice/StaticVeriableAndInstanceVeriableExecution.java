package blocks_practice;

public class StaticVeriableAndInstanceVeriableExecution {
    static int a = 100;
    int b = 50;

    public static void main(String[] args) {

        StaticVeriableAndInstanceVeriableExecution  obj = new StaticVeriableAndInstanceVeriableExecution();
        obj.a = 150;         // value print 250 because static print only recent value to each static var
        obj.b = 60;

        StaticVeriableAndInstanceVeriableExecution obj1 = new StaticVeriableAndInstanceVeriableExecution();
        obj1.a = 200;        // value print 250 because static print only recent value to each static var
        obj1.b = 70;

        StaticVeriableAndInstanceVeriableExecution obj2 = new StaticVeriableAndInstanceVeriableExecution();
        obj2.a = 250;         // value print 250 because static print only recent value to each static var
        obj2.b= 80;

        System.out.println("1st variable extract from 1st object: "+obj.a);   //o/p = 250
        System.out.println("2nd variable extract from 1st object: "+obj.b);   //o/p = 60

        System.out.println("1st variable extract from 2st object: "+obj1.a);   //o/p = 250
        System.out.println("2nd variable extract from 2st object: "+obj1.b);   //o/p = 70

        System.out.println("1st variable extract from 3rd object: "+obj2.a);   //o/p = 250
        System.out.println("2nd variable extract from 3rd object: "+obj2.b);   //o/p = 80
    }
}
