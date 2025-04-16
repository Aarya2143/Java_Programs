package object_class_method;

public class HashCode
{
   int i ;
   HashCode(int i)
   {
       this.i = i;
   }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        HashCode h1 = new HashCode(5);
        HashCode h2 = new HashCode(58);
        System.out.println(h1);
        System.out.println(h2);
    }
}
