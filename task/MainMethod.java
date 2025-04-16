package task;

class MainMethod {
    int a=20;
    int b=10;
    public static void main(String[] args) {
          Integer i = 127;
          Integer j = 127;
        System.out.println(i.equals(j));
        System.out.println(i == j);
    }
}


class abd{
    public static final void main(String[] aarya) {
      class sub{
          void add(){
              System.out.println("add");
          }
          public static void main(String[] args) {
              sub o = new sub();
              o.add();
          }
      }
    }
}

class a{
//    void add(){
//        System.out.println("A method");
//    }
}
class b extends a{

    void add() {
        System.out.println("B method");
    }

//    public static void main(String[] args) {
//        a obj = new b();
//        obj.add();
//    }
}

class gus {
   void add(){
       class jui{
           jui o = new jui();

       }
   }
}

class Helllo{
    public static void main(String[] args) {
        System.out.println("Original Main");
        Helllo o = new Helllo();
        o.main(12,3);
        o.main(2,2,2);
    }

    public static void main(int a, int b)
    {
        System.out.println("add: "+(a+b));
    }

    public static void main(int a, int b, int c)
    {
        System.out.println("addition: "+(a+b+c));
    }
}
class Hi extends Helllo{

   public static void main(int a, int b){
       System.out.println("s");
   }

    public static void main(String[] args) {

    }
}