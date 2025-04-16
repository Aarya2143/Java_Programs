package java8.LambdaExpression;

interface Resu{
    void cast();
}
public class ThrowExp {
    public static void main(String[] args) {
        Resu obj = () -> {
          Object o = "hello";
          Integer inte = (Integer) o;
          System.out.println(inte);

          throw new ClassCastException("Cant convert string to int");
        };
        obj.cast();
    }
}
