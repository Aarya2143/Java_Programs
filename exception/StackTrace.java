package exception;

public class StackTrace {
   int div(int a, int b){
       int c = a/b;
       return c;
   }
   int test()
   {
       return div(10,0);
   }
    public static void main(String[] args) {
        StackTrace st = new StackTrace();
        st.test();
    }
}
